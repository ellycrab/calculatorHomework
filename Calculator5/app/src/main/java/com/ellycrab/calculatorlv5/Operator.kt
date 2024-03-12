package com.ellycrab.calculatorlv5

interface Operator {

    //연산
    fun doOperate(num1:Double, num2:Double):Double

    //우선순위
    val precedence:Int

}