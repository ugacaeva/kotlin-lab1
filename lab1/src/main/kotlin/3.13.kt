import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val x = sc.nextDouble()
    println("y = ${findY(x)}")
}

fun findY (x:Double) =
    if (x<=0) 0
    else if (x>0 && x<=1) x
    else Math.pow(x,2.0)