import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println ("Введите координаты точки x, y: ")
    val x = sc.nextDouble()
    val y = sc.nextDouble()
    println ("Введите радиус окружности r: ")
    val r = sc.nextDouble()
    println("1) ${isInCircle(x, y, r)}")
    println("2) ${isInRing(x, y, r)}")
}

fun isInCircle(x: Double, y: Double, r: Double) =
    if (Math.sqrt(x*x + y*y) <= r) "Точка x принадлежит кругу радиуса $r"
    else "Точка x не принадлежит кругу радиуса $r"

fun isInRing(x: Double, y: Double, r: Double):String {
    val d = Math.sqrt(x*x + y*y)
    return if (d<=(2*r) && d>=r) "Точка x лежит в кольце"
    else "Точка x не лежит в кольце"
}
