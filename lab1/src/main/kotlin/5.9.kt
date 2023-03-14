import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите n от 2 до 5:")
    val n = sc.nextInt()
    println("Введите x:")
    val x = sc.nextDouble()
    println("cos^$n($x) = ${findCos(n,x)}")
}

fun findCos(n:Int, x:Double) =
    when (n) {
        2 -> (1+Math.cos(2.0*x))/2.0
        3 -> (3.0*Math.cos(x) + Math.cos(3.0*x))/4.0
        4 -> (3+4.0*Math.cos(2.0*x)+Math.cos(4.0*x))/8.0
        5 -> (10.0*Math.cos(x) + 5.0*Math.cos(3.0*x) + Math.cos(5.0*x))/16.0
        else -> "n не соответствует условию"
    }