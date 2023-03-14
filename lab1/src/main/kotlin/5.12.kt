import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите значение числа m:")
    val m = sc.nextInt()
    println("Сумма нечетных положительных чисел меньше m = ${sumOfPositiveOddNumbers(m)}")
}

fun sumOfPositiveOddNumbers(m:Int):Int {
    var sum = 0
    for (i in 1 until m step 2) {
        sum += i
    }
    return sum
}