import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    if (isFive(n)) println("В записи числа $n есть цифра 5")
    else println("В записи числа $n нет цифры пять")
}

fun isFive(n:Int):Boolean {
    var d: Double
    var n2 = n
    var flag = false
    while (n2 != 0) {
        d = n2 % 10.0
        n2 /= 10
        if (d == 5.0) {
            flag = true
            break
        }
    }
    return flag
}