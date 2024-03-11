package com.ellycrab.calculatorlv3

class SubstractOperation {

    //2.빼기
    fun minus(num1: String?, num2: String?): Double? {
        return try {
            val a: Double = num1?.toDoubleOrNull() ?: return null
            val b: Double = num2?.toDoubleOrNull() ?: return null

            a-b

        } catch (e: NumberFormatException) {
            println("숫자로 변환 불가")
            return null
        }
    }
}