package com.ellycrab.calculatorlv5

class RemainOperation:Operator {
    override fun doOperate(num1: Double, num2: Double): Double {

        if(num2 == 0.0){
            println("0으로 나눌수 없습니다")
        }

        return num1%num2
    }

    override val precedence: Int
        get() = 2
}