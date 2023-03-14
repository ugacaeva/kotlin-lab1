import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите b < 0")
    val b = sc.nextDouble()
    println("a = ${findFirstPositive(b)}")
}

fun findFirstPositive(b:Double):Double {
    var a = b
    var i = 2.0
    while (a<=0) {
        a = (a + Math.abs(Math.sin(i)))/(i - Math.pow(Math.sin(i),2.0))
        println ("$i, $a, ${a>0}\n")
        ++i
    }
    return a
}