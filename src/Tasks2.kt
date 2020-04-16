fun main(args: Array<String>) {
    task8()
    task9()
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

fun calc(dep: Double, rate: Double) : Double {
    return 0.01*dep*rate/12
}

fun task9() {
    val table : Array<Array<String>> = Array(3) {Array(3) {""} }
    table[0] = arrayOf("Japan", "China", "USA")
    table[1] = arrayOf("Tokio", "Beijing", "Washington")
    table[2] = arrayOf("JPY", "CNY", "USD")
    for (i in 0 until table.size) {
        for (j in 0 until table.size) {
                print("${table[j][i]}\t")
        }
        println()
    }

}