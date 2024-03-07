package com.ellycrab.calculatorlv4
import java.lang.Exception


fun main() {
    val operations = listOf(
        AddOperation(),
        SubtractOperation(),
        MultiplyOperation(),
        DivideOperation()
    )

    val calculator = Calculator(operations)

    while (true) {
        println("숫자1을 입력해주세요.")
        val num1 = readLine()

        println("숫자2을 입력해주세요")
        val num2 = readLine()

        println("연산을 선택해주세요.")
        println("1번 +, 2번 -, 3번 *, 4번 / ")

        val op = readLine()

        val opResult = op?.toIntOrNull()

        if (opResult != null && opResult in 1..4) {
            val result = calculator.calculate(num1, num2, opResult)

            if (result != null) {
                println("결과: $result")
            } else {
                println("연산이 불가능합니다.")
            }
        } else if (opResult == -1) {
            println("-1을 입력하여 종료합니다. 바이바이")
            break
        } else {
            println("올바른 연산기호가 아닙니다.")
        }
    }
}