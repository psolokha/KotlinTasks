fun main(args: Array<String>) {
    task1()
    task2()
    task3()
    task4()
    task5()
}

fun task1() {
    var anyVar: Any? = null
    anyVar = 5
    var otherVar = anyVar
    var dividedVar = otherVar/2.5
    println(dividedVar is Double)
}

fun task2() {
    var helloString = "hello"
    var aplanaString = "aplana"
    println("${helloString} ${aplanaString}")
}

fun task3() {
    var five: Char = '5'
    five.toByte()
    five.toShort()
    five.toInt()
    five.toDouble()
    five.toFloat()
    five.toLong()
}

fun task4() {
    println("Please, type your name:")
    var userName = readLine()
    println("Hi, $userName")
}

fun task5() {
    var range = 'z' downTo 'a'
    for (a in range) print(a)
}