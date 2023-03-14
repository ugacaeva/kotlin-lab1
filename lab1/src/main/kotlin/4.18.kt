import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    if (isDecreasing(n)) println("Цифры в числе упорядочены по убыванию")
    else println("Цифры в числе не упорядочены по убыванию")
}

fun isDecreasing(n:Int):Boolean {
    var d = n%10
    var flag = true
    var p:Int
    var n2 = n/10
    while (n2 != 0) {
        p = d
        d = n2 % 10
        n2 /= 10
        if (p > d) {
            flag = false
            break
        }
    }
    return flag
}