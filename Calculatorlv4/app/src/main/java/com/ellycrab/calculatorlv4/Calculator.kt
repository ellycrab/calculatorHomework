package com.ellycrab.calculatorlv4

class Calculator(private val operations: List<AbstractOperation>) {

    fun calculate(num1: String?, num2: String?, operatorIndex: Int): Double? {
        val selectedOperation = operations.getOrNull(operatorIndex - 1)

        return if (selectedOperation != null) {
            selectedOperation.operate(num1, num2)
        } else {
            println("올바른 연산기호가 아닙니다.")
            null
        }
    }

}