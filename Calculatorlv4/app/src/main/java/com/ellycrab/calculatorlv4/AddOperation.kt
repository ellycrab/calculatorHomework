package com.ellycrab.calculatorlv4

class AddOperation:AbstractOperation() {
    override fun operate(num1: String?, num2: String?): Double? {
        val a:Double? = convertToDouble(num1)
        val b:Double? = convertToDouble(num2)

        return if(a!=null && b!=null){
            a+b
        }else{
            println("숫자로 변환할 수 없거나 null입니다")
            null
        }
    }
}