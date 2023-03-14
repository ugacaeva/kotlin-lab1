import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите значение натурального числа m: ")
    var m = sc.nextInt()
    println("Введите значение натурального числа n: ")
    var n = sc.nextInt()
    if (n > 0 && m > 0) println("НОК (m;n) = ${findNOK(m, n)}")
    println("Числа m и n не являются натуральными")
}

fun findNOK(m1:Int, n1:Int): Int {
    var m = m1
    var n = n1
    val mn = m * n
        while (n != m) {
            if (m > n) {
                m -= n
            } else n -= m
        }
        val NOK = (mn / m)
        return NOK
}
