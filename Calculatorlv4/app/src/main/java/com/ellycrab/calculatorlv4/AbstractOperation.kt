package com.ellycrab.calculatorlv4

open abstract class AbstractOperation {
    //자식에게서만 사용할수 있도록 패키지 protected로 설정함
    protected fun convertToDouble(str: String?): Double? {
        return str?.toDoubleOrNull()
    }

    //연산은 모두 공통임
    open abstract fun operate(num1: String?, num2: String?): Double?
}