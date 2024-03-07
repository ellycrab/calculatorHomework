package com.ellycrab.calculatorlv4

class DivideOperation:AbstractOperation() {
    override fun operate(num1: String?, num2: String?): Double? {
        val a: Double? = convertToDouble(num1)
        val b: Double? = convertToDouble(num2)

        return if (a!=null && b!=null){
            if(b != 0.0){
                a/b
            }else{
                println("0으로 나눌 수 없습니다.")
                null
            }
        }else{
            println("숫자로 변환할 수 없거나 null입니다")
            null
        }
    }
}