package ru.netology

fun main() {
    println(agoToText(50, "Alexander"))
    println(agoToText(3120, "Anastasia"))
    println(agoToText(40600, "John"))
    println(agoToText(90000, "Anna"))
    println(agoToText(173000, "Bob"))
    println(agoToText(260000, "Boris"))
}

fun agoToText(time: Int, name: String): String {
    return when (time) {
        in 0..60 -> "$name был(a) только что"
        in 61..60 * 60 -> "$name был(a) ${time / 60} ${minutesDisplay(time)}"
        in 60 * 60 + 1..24 * 60 * 60 -> "$name был(a) ${time / 3600} ${hoursDisplay(time)}"
        in 24 * 60 * 60 + 1..48 * 60 * 60 -> "$name был(a) сегодня"
        in 48 * 60 * 60 + 1..72 * 60 * 60 -> "$name был(a) вчера"
        else -> "$name был(а) давно"
    }
}

fun minutesDisplay(time: Int): String {
    return when {
        time / 60 in 11..19 -> "минут назад"
        time / 60 % 10 == 1 -> "минуту назад"
        time / 60 % 10 == 2 || time / 60 % 10 == 3 || time / 60 % 10 == 4 -> "минуты назад"
        else -> "минут назад"
    }
}

fun hoursDisplay(time: Int): String {
    return when {
        time / 3600 in 11..19 -> "часов назад"
        time / 3600 % 10 == 1 -> "час назад"
        time / 3600 % 10 == 2 || time / 3600 % 10 == 3 || time / 3600 % 10 == 4 -> "часа назад"
        else -> "часов назад"
    }
}

