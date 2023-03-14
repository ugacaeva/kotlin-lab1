import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextDouble()
    println("Первое число последовательности > a = ${findFirstNumber(a)}")
}

fun findFirstNumber(a:Double): Double {
    var num = 1.0
    var i = 1
    println("$i    $num    ${num > a}")
    while (num<=a) {
        i++
        num += (1.0 / i)
        println("$i    $num    ${num > a}")
    }
    return num
}