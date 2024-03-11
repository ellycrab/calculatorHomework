package com.ellycrab.calculatorlv3

class AddOperation {
    /*  String 숫자타입으로 변환시키는 메서드
   -toInt()  toIntOrNull()  toDouble()  toDoubleOrNull()
    */

    //1.더하기

    fun add(num1: String?, num2: String?): Double? {
        return try {
            val a: Double = num1?.toDoubleOrNull() ?: return null
            val b: Double = num2?.toDoubleOrNull() ?: return null

            a + b
        } catch (e: NumberFormatException) {
            println("숫자로 변환 불가")
            null
        }
    }
}