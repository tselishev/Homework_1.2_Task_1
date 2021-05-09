package ru.netology

fun main() {

    val transaction = 3400 // сумма перевода
    val commission = 0.75 // комиссия %
    val minTransaction = 35 // минимальная сумма перевода
    val amount = 100 // количество копеек в 1 рубле

    if (transaction < minTransaction) {
        println("Минимальная сумма перевода: $minTransaction руб или " + minTransaction * amount + " коп")
    } else {
        println("Сумма перевода: $transaction руб, или " + transaction * amount + " коп, комиссия $commission %")
        val amountComiss = transaction * commission / 100
        println("Комиссия составит: $amountComiss руб, или " + amountComiss * amount + " коп")
    }

}


