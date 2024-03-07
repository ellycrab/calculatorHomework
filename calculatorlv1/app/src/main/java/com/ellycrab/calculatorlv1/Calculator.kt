package com.ellycrab.calculatorlv1

import java.lang.Exception

class Calculator {

    //1.더하기-toInt()  toIntOrNull()  toDouble()  toDoubleOrNull()

    fun add(num1: String?, num2: String?): Double? {
        try {
            val a: Double? = num1?.toDoubleOrNull()
            val b: Double? = num2?.toDoubleOrNull()

            if (a != null && b != null) {
                // a와 b가 null이 아니라면
                return a + b
            } else {
                println("숫자로 변환할 수 없거나 null입니다.")
                return null
            }

        } catch (e: NumberFormatException) {
            println("숫자로 변환 불가")
            return null
        }
    }

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

    //3.나누기
    fun divide(num1: String?, num2: String?): Double? {
        try {
            val a: Double? = num1?.toDoubleOrNull()
            val b: Double? = num2?.toDoubleOrNull()

            if (a != null && b != null) {
                // a와 b가 null이 아니라면
                return a / b
            } else {
                println("숫자로 변환할 수 없거나 null입니다.")
                return null
            }

        } catch (e: NumberFormatException) {
            println("숫자로 변환 불가")
            return null
        }
    }
    //4.곱하기
    fun multiply(num1: String?, num2: String?): Double? {
        try {
            val a: Double? = num1?.toDoubleOrNull()
            val b: Double? = num2?.toDoubleOrNull()

            if (a != null && b != null) {
                // a와 b가 null이 아니라면
                return a * b
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