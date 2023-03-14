import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите шаг h ∈ (0;1): ")
    val h = sc.nextDouble()
    if (h<1 && h>0) {
        println("Введите начальное значение x <= 0: ")
        val xn = sc.nextDouble()
        if (xn<=0) println("f(x) = ${findFunctionValue(h, xn)}")
        else println("Начальное значение x больше 0")
    }
    else println("Значение шага h не лежит в промежутке (0;1)")
}

fun findFunctionValue(h:Double, xn:Double):Double {
    var x = xn
    var f = x
    while (Math.exp(0.2 * x) < 5.0 * Math.abs(xn)) {
        f = Math.exp(0.2 * x) + Math.pow(Math.exp(0.2 * x), 1.0 / 3) + Math.pow(Math.exp(0.2 * x), 1.0 / 5)
        println("$x, $f")
        x += h
    }
    return f
}