package com.ellycrab.calculatorlv5

// 뺄셈 클래스
class SubtractOperation : Operator {
    override fun doOperate(num1: Double, num2: Double): Double {
        return num1-num2
    }

    override val precedence: Int
        get() = 1
}