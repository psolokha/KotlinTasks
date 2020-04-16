fun main(args: Array<String>) {
    task8()
}

fun task8() {
    println("Введите сумму депозита:")
    var dep : Double = readLine()!!.toDouble()
    println("Введите длительность вклада (в месяцах):")
    val per : Int = readLine()!!.toInt()
    println("Введите процентную ставку")
    val rate : Double = readLine()!!.toDouble()

    println("Сумма вклада равна:")
    for (i in 1 .. per) {
        println("Месяц $i: ${calc(dep, rate)}")
        dep+=calc(dep,rate)
        println("Сумма вклада: $dep")
    }
}

