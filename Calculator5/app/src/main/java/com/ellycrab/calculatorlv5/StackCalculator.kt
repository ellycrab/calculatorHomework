package com.ellycrab.calculatorlv5

import java.util.Stack

class StackCalculator {

    //연산자 매핑
    val operators = mapOf(
        "+" to AddOperation(),
        "-" to SubtractOperation(),
        "*" to MultiplyOperation(),
        "/" to DivideOperation(),
        "%" to RemainOperation()
    )
    //표현식 계산 메서드
    fun calculateExpression(expression: String): Double {
        val tokens = tokenizeExpression(expression)
        val postfixTokens = infixToPostfix(tokens)
        return evaluatePostfix(postfixTokens)
    }

    //입력받은 문자열을 작은 단위로 나누어 처리함-토큰화
    fun tokenizeExpression(expression:String):List<String>{
        return expression.split(Regex("(?=[-+*/%()])|(?<=[-+*/%()])"))
            .filter { it.isNotBlank() }
    }

    // 문자열이 숫자인지 확인하는 확장 함수
    private fun String.isNumeric(): Boolean {
        return this.toDoubleOrNull() != null
    }

    // 중위 표기법을 후위 표기법으로 변환하는 메서드
    fun infixToPostfix(infixTokens: List<String>): List<String> {
        // 변환된 후위 표기법 토큰을 저장할 리스트
        val postfixTokens = mutableListOf<String>()

        // 연산자 스택
        val stack = Stack<String>()

        // 주어진 중위 표기법 토큰들을 하나씩 처리
        for (token in infixTokens) {
            when {
                // 피연산자인 경우 바로 결과 리스트에 추가
                token.isNumeric() -> postfixTokens.add(token)

                // 여는 괄호인 경우 스택에 추가
                token == "(" -> stack.push(token)

                // 닫는 괄호인 경우 여는 괄호가 나올 때까지 스택에서 pop하여 결과 리스트에 추가
                token == ")" -> {
                    while (stack.isNotEmpty() && stack.peek() != "(") {
                        postfixTokens.add(stack.pop())
                    }
                    stack.pop() // 여는 괄호 제거
                }

                // 연산자인 경우 스택의 연산자들과 비교하여 우선순위가 높거나 같은 것들을 결과 리스트에 추가하고, 현재 연산자를 스택에 추가
                token in operators -> {
                    while (stack.isNotEmpty() && stack.peek() in operators &&
                        operators[stack.peek()]!!.precedence >= operators[token]!!.precedence) {
                        postfixTokens.add(stack.pop())
                    }
                    stack.push(token)
                }

                // 그 외의 경우 예외 처리
                else -> throw IllegalArgumentException("유효하지 않은 토큰: $token")
            }
        }

        // 스택에 남아있는 모든 연산자를 결과 리스트에 추가
        while (stack.isNotEmpty()) {
            postfixTokens.add(stack.pop())
        }

        // 최종 후위 표기법 토큰 리스트 반환
        return postfixTokens
    }

    // 후위 표기법을 평가하는 메서드
    private fun evaluatePostfix(postfixTokens: List<String>): Double {
        // 계산에 사용될 스택
        val stack = Stack<Double>()

        // 후위 표기법 토큰 리스트를 순회
        for (token in postfixTokens) {
            // 토큰이 숫자인 경우, 해당 숫자를 double 타입으로 변환하여 스택에 push
            if (token.isNumeric()) {
                stack.push(token.toDouble())
            }
            // 토큰이 연산자인 경우
            else if (token in operators) {
                // 스택에서 두 개의 피연산자를 pop하여 해당 연산자로 계산하고 결과를 다시 스택에 push
                val operand2 = stack.pop()
                val operand1 = stack.pop()
                val result = operators[token]!!.doOperate(operand1, operand2)
                stack.push(result)
            }
            // 그 외의 경우는 유효하지 않은 토큰이므로 예외 발생
            else {
                throw IllegalArgumentException("후위 표기법에서 유효하지 않은 토큰: $token")
            }
        }

        // 스택에는 최종 계산 결과가 남아 있어야 함
        return if (stack.size == 1) {
            stack.pop()
        } else {
            throw IllegalArgumentException("유효하지 않은 후위 표기법")
        }
    }
}