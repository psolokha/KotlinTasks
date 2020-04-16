fun main(args: Array<String>) {
    task7()
}

fun task7() {
    var points = 0
    println("Тест:")
    println("10 : 2 = ?")
    var a = readLine()?.toInt()
    when (a) {
        5 -> ++points
    }
    println("Напиши гласную букву:")
    var b = readLine()
    when (b) {
        "a","e","i","o","u","y" -> ++points
        "а","е","ё","и","о","у","ы","э","ю","я" -> ++points
    }
    println("Мороз и солнце день ...")
    var c = readLine()
    when (c?.toLowerCase()) {
        "чудесный" -> ++points
    }
    println("Нарисуй окружность")
    var d = readLine()
    when (d) {
        "o", "O" -> ++points
        "о", "О" -> ++points
        "0" -> ++points
    }
    println("0,5 + 0,5 = ?")
    var e = readLine()
    when (e) {
        "1", "1,0", "1.0" -> ++points
        "литр" -> {
            points/=5
            println("ай-ай-ай")
        }
    }
    when (points) {
        5 -> println("Отлично! Переведен в третий класс!")
        4 -> println("Молодец. Переведен в третий класс.")
        3 -> println("Ступай в третий класс")
        2,1 -> println("Как ты умудрился ответить на последний вопрос???")
        0 -> println("Родителей в школу!")
    }
}