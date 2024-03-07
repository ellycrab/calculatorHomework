package com.ellycrab.calculatorlv1

/* Lv1
        더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들고,
        클래스를 이용하여 연산을 진행하고 출력하기*/
fun main() {
    var cal = Calculator()

    print("숫자1을 입력해주세요.")
    var num1 = readLine()

    print("숫자2를 입력해주세요.")
    var num2 = readLine()

    println("연산을 선택해주세요.")
    println("1번 +, 2번 -, 3번 *, 4번 /")

    val op = readLine()

    val opResult = op?.toIntOrNull()

    if(opResult != null && opResult in 1..4){
        when(opResult){
            1->{//더하기

                val resultAdd =cal.add(num1,num2)
                if(resultAdd!=null){
                    println("결과: ${resultAdd}")
                }else{
                    println("연산이 불가능합니다.")
                }
            }
            2->{//빼기
                val minusResult =  cal.minus(num1,num2)
                if(minusResult!=null){
                    println("결과: ${minusResult}")
                }else{
                    println("연산이 불가합니다")
                }
            }
            3->{//곱하기
                val multipleResult = cal.multiply(num1,num2)
                if(multipleResult !=null){
                    println("결과: ${multipleResult}")
                }else{
                    println("연산이 불가합니다.")
                }
            }
            4->{//나누기
                val divideResult = cal.divide(num1,num2)
                if(divideResult !=null){
                    println("결과: ${divideResult}")
                }else{
                    println("연산이 불가합니다.")
                }
            }

        }
    }else{
        println("올바른 연산기호가 아닙니다.")
        return
    }

}

