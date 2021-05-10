package ru.netology

fun main() {

    val transaction = 1000 // сумма перевода
    val commission = 0.75 // комиссия 0,75%
    val minTransaction = 35 // минимальная сумма перевода
    val amount = 100 // количество копеек в 1 рубле

    val minTransactionCop = minTransaction * amount // минимальная сумма перевода в копейках

    val transactionCop = transaction * amount // сумма перевода в коп

    val resultComission = transaction * commission / 100 // коммиссия с суммы перевода в руб
        val resultComissionCop = transactionCop * commission / 100 // коммиссия с суммы перевода в коп

    val resultTransaction = transaction - resultComission // итоговая сумма после снятия комиссии в руб
    val resultTransactionCop = transactionCop - resultComissionCop // итоговая сумма после снятия комиссии в коп

    if (transaction < minTransaction) {// итоговая сумма после снятия комиссии в руб
        println("Минимальная сумма перевода составит: $minTransaction руб или  $minTransactionCop коп")
    } else {
        println("Сумма для перевода: $transaction руб ($transactionCop коп) " +
                "\nКомиссия составит: $resultComission руб ($resultComissionCop коп) \n\nИтого сумма перевода, " +
                "с учетом комиссии: $resultTransaction руб ($resultTransactionCop коп)")

    }

}


