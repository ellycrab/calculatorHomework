package com.ellycrab.calculatorlv2

fun main() {
   /*
   - Lv1에서 만든 Calculator 클래스에 출력 이후 추가 연산을 가능하도록 코드를 추가하고,
    연산 진행 후 출력하기

    Lv1에서 만든 Calculator 클래스에 나머지 연산자(%)를 추가하기.
    그리고 -1을 입력 할 때까지 계산을 반복합니다. (1번 +, 2번 -, 3번 *, 4번 /, 5번 %)
    */
    var cal = Calculator()

    while(true){

        print("숫자1을 입력해주세요.")
        var num1 = readLine()

        print("숫자2를 입력해주세요.")
        var num2 = readLine()

        println("연산을 선택해주세요.")
        println("1번 +, 2번 -, 3번 *, 4번 / 5번 %")

        val op = readLine()

        val opResult = op?.toIntOrNull()

        if(opResult != null && opResult in 1..5){
            when(opResult){
                1->{//더하기

                    val resultAdd = num1?.let {
                        if (num2 != null) {
                            cal.add(it,num2)
                        }
                    }
                    if(resultAdd!=null){
                        println("결과: ${resultAdd}")
                    }else{
                        println("연산이 불가능합니다.")
                    }
                }
                2->{//빼기
                    val minusResult = num1?.let {
                        if (num2 != null) {
                            cal.minus(it,num2)
                        }
                    }
                    if(minusResult!=null){
                        println("결과: ${minusResult}")
                    }else{
                        println("연산이 불가합니다")
                    }
                }
                3->{//곱하기
                    val multipleResult = num1?.let {
                        if (num2 != null) {
                            cal.multiply(it,num2)
                        }
                    }
                    if(multipleResult !=null){
                        println("결과: ${multipleResult}")
                    }else{
                        println("연산이 불가합니다.")
                    }
                }
                4->{//나누기
                    val divideResult = num1?.let {
                        if (num2 != null) {
                            cal.divide(it,num2)
                        }
                    }
                    if(divideResult !=null){
                        println("결과: ${divideResult}")
                    }else{
                        println("연산이 불가합니다.")
                    }
                }
                5->{//나머지
                     val remainResult = num1?.let {
                         if (num2 != null) {
                             cal.remainder(it,num2)
                         }
                     }
                    if (remainResult !=null){
                        println("결과: ${remainResult}")
                    }else{
                        println("연산이 불가합니다.")
                    }
                }

            }
        }else if(opResult == -1){
            println("-1을 입력하여 종료합니다. bye")
            break
        }
        else{
            println("올바른 연산기호가 아닙니다.")

        }

    }
}