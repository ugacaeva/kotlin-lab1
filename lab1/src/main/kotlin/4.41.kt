import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println("1) Сумма = ${findSum1(n)}")
    println("2) Сумма = ${findSum2(n)}")
}

fun findSum1(n:Int):Double {
    var sum = 0.0
    var fact = 1.0
    for (i in 1..n) {
        fact *= i
        sum += Math.pow(-1.0, i.toDouble())*(i+1)/fact
    }
    return sum
}

fun findSum2(n:Int):Double {
    var sumi = 0.0
    var sumj = 0.0
    var fact = 1.0
    for (i in 1..n) {
        for (j in 1..i) {
            sumj += 1.0/j
        }
        fact *= i
        sumi += fact/sumj
    }
    return sumi
}