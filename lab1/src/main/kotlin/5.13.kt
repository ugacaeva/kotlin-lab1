import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите значение числа m:")
    val m = sc.nextInt()
    println("Введите отрезок [a, b]:")
    val a = sc.nextInt()
    val b = sc.nextInt()
    println("Сумма положительных чисел в отрезке [$a; $b], кратных m = ${sumOfPositiveNumbers(m, a, b)}")
}

fun sumOfPositiveNumbers(m:Int, a:Int, b:Int):Int {
    var sum = 0
    for (i in a..b) {
        if (i > 0 && i%m == 0) sum += i
    }
    return sum

}