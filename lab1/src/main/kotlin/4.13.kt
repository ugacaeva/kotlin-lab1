import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    if (n>0) {
        if (isPrime(n)) println("Натуральное число $n является простым")
        else println("Натуральное число $n не является простым")
    }
    else println("Введенное число не является натуральным")
}

fun isPrime(n:Int):Boolean {
    var flag = true
    var d = 2.0
    var o:Double
    while (d <= n/2) {
        o = n%d
        d++
        if (o == 0.0) {
            flag = false
            break
        }
    }
    return flag
}