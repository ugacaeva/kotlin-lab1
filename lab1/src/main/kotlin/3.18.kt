import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println ("Введите коэффициенты первой прямой: ")
    val a1 = sc.nextDouble()
    val b1 = sc.nextDouble()
    val c1 = sc.nextDouble()
    println ("Введите коэффициенты второй прямой: ")
    val a2 = sc.nextDouble()
    val b2 = sc.nextDouble()
    val c2 = sc.nextDouble()
    println ("Введите коэффициенты третьей прямой: ")
    val a3 = sc.nextDouble()
    val b3 = sc.nextDouble()
    val c3 = sc.nextDouble()
    println(doIntersect(a1, b1, c1, a2, b2, c2, a3, b3, c3))
}

fun doIntersect(a1:Double, b1:Double, c1:Double, a2:Double, b2:Double, c2:Double, a3:Double, b3:Double, c3:Double):String {
    val det = (a1*b2*c3 + b1*c2*a3 + c1*a2*b3 - c1*b2*a3 - a1*c2*b3 - b1*a2*c3)
    return if (det == 0.0) "Три прямые пересекаются в одной точке"
    else "Три прямые не пересекаются в одной точке"
}