package com.ellycrab.calculatorlv3

class MultiplyOperation {

    //4.곱하기
    fun multiply(num1: String?, num2: String?): Double? {
        return try {
            val a: Double = num1?.toDoubleOrNull() ?: return null
            val b: Double = num2?.toDoubleOrNull() ?: return null

            a*b

        } catch (e: NumberFormatException) {
            println("숫자로 변환 불가")
            return null
        }
    }
}