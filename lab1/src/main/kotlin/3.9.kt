import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    println(isDoubleDigit(N))
}

fun isDoubleDigit(N:Int) =
    when (N) {
        in 10..99 -> "Число является двузначным, сумма цифр числа: ${N/10%10 + N%10}"
        in 100..999 -> {
            var pr = 1
            pr *= N/100%10
            if (N/10%10 != 0) pr *= N/10%10
            if (N%10 != 0) pr *= N%10
            "Число является трехзначным, произведение ненулевых цифр числа = $pr"
        }
        else -> "Число не является двузначным или трехзначным"
    }
