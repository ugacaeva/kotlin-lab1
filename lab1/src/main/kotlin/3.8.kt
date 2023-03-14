import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val num = sc.nextInt()
    println(isThreeDigit(num))
}

fun isThreeDigit (num:Int) = if (num>=100 && num<=999) "Число является трехзначным, последние две цифры числа: ${num/10%10}, ${num%10}"
    else "Число не является трехзначным"