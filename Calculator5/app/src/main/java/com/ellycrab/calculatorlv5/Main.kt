package com.ellycrab.calculatorlv5

import java.lang.Exception
import java.util.Stack


fun main(){
    val calculator = StackCalculator()

    while(true){
        println("수식을 입력하세요 (예: (1+7)*8-77*(10%3-7), 종료하려면 -1 입력):")
        val input:String? = readLine()

        if(input == "-1"){
            println("프로그램을 종료합니다")
            break
        }

        try{
            val result = calculator.calculateExpression(input ?: "")
            println("결과: $result")
        }catch (e:Exception){
            println("오류발생: ${e.message}")
        }
    }
}