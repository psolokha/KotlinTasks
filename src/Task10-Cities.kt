fun main(args: Array<String>) {
    task10()
}

fun task10() {
    var cityCollection:ArrayList<String> = ArrayList()
    choice(cityCollection)
}

fun choice(cityCollection: ArrayList<String>) {

    println("-----------------------------")
    println("Выберите действие:")
    println("1.Добавить город")
    println("2.Посмотреть список городов")
    println("3.Выйти из программы")
    println("-----------------------------")
    var ch = readLine()
    when (ch) {
        "1" -> {
          println("Введите название города:")
            cityCollection.add(readLine().toString().toUpperCase())
            for( city in cityCollection) println(city)
            choice(cityCollection)
        }
        "2" -> {
            for( city in cityCollection.toHashSet()) println(city)
            choice(cityCollection)
        }
        "3" -> {
            println("Всего доброго!")
            return
        }
        else -> {
            println("Неправильное значение.\nПовторите выбор (1,2 или 3)")
            choice(cityCollection)
        }
    }
}