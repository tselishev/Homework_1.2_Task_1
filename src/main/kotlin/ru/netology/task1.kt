package ru.netology

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите сумму перевода и нажмите 'enter':")
    val transaction = scanner.nextInt()
    val calcResult = calc(transaction)
    println("Сумма перевода $transaction руб, комиссия: $calcResult руб")

}

fun calc(transaction: Int): Double {

    val transactionCop = transaction * 100 // переводим в коп
    var comissionCop = (transactionCop / 100) * 0.75
    if (comissionCop < 3500) {
        comissionCop = 3500.00
    } else {
        comissionCop
    }
    return comissionCop / 100 // переводим комиссию из коп в рубли
}

