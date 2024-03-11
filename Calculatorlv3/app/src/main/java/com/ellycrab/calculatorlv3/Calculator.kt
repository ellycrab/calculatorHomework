package com.ellycrab.calculatorlv3
import java.lang.Exception



    //1.더하기-toInt()  toIntOrNull()  toDouble()  toDoubleOrNull()

    /*
    - AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를을 만든 후 클래스간의 관계를 고려하여
      Calculator 클래스와 관계를 맺기
    - 관계를 맺은 후 필요하다면 Calculator 클래스의 내부 코드를 변경하기
        - 나머지 연산자(%) 기능은 제외합니다.
    - Lv2 와 비교하여 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
        - hint. 클래스의 책임(단일책임원칙)
     */
    fun main(){

        val addRs = AddOperation()
        val substractRs = SubstractOperation()
        val multipleRs = MultiplyOperation()
        val divideRs = DivideOperation()

        while(true){
            println("숫자1을 입력해주세요.")
            var num1 = readLine()

            println("숫자2을 입력해주세요")
            var num2 = readLine()

            println("연산을 선택해주세요.")
            println("1번 +, 2번 -, 3번 *, 4번 / ")

            val op = readLine()

            val opResult = op?.toIntOrNull()

            if(opResult !=null && opResult in 1..4){
                when(opResult){
                    1 -> {
                        // 더하기
                        if (num1.isNullOrBlank() || num2.isNullOrBlank()) {
                            println("두 수 중 하나라도 비어있으면 안됩니다.")
                        } else {
                            val resultAdd = addRs.add(num1, num2)
                            if (resultAdd != null) {
                                println("결과: $resultAdd")
                            } else {
                                println("연산이 불가능합니다.")
                            }
                        }
                    }
                    2 -> {
                        // 빼기
                        if (num1.isNullOrBlank() || num2.isNullOrBlank()) {
                            println("두 수 중 하나라도 비어있으면 안됩니다.")
                        } else {
                            val resultMinus = substractRs.minus(num1, num2)
                            if (resultMinus != null) {
                                println("결과: $resultMinus")
                            } else {
                                println("연산이 불가능합니다.")
                            }
                        }
                    }

                    3 -> {
                        // 곱하기
                        if (num1.isNullOrBlank() || num2.isNullOrBlank()) {
                            println("두 수 중 하나라도 비어있으면 안됩니다.")
                        } else {
                            val resultMulti = multipleRs.multiply(num1, num2)
                            if (resultMulti != null) {
                                println("결과: $resultMulti")
                            } else {
                                println("연산이 불가능합니다.")
                            }
                        }
                    }

                    4 -> {
                        // 나누기
                        if (num1.isNullOrBlank() || num2.isNullOrBlank()) {
                            println("두 수 중 하나라도 비어있으면 안됩니다.")
                        } else {
                            val resultDivide = divideRs.divide(num1, num2)
                            if (resultDivide != null) {
                                println("결과: $resultDivide")
                            } else {
                                println("연산이 불가능합니다.")
                            }
                        }
                    }
                }
            }else if(opResult == -1){
                println("-1을 입력하여 종료합니다. 바이바이")
                break
            }
            else{
                println("올바른 연산기호가 아닙니다.")

            }

        }
    }
