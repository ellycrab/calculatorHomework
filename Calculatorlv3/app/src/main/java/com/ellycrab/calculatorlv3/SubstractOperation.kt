package com.ellycrab.calculatorlv3

class SubstractOperation {

    //2.빼기
    fun minus(num1: String?, num2: String?): Double? {
        try {
            val a: Double? = num1?.toDoubleOrNull()
            val b: Double? = num2?.toDoubleOrNull()

            if (a != null && b != null) {
                // a와 b가 null이 아니라면
                return a - b
            } else {
                println("숫자로 변환할 수 없거나 null입니다.")
                return null
            }

        } catch (e: NumberFormatException) {
            println("숫자로 변환 불가")
            return null
        }
    }
}