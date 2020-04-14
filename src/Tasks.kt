fun main(args: Array<String>) {
    task1()
}

fun task1() {
    var anyVar: Any? = null
    anyVar = 5
    var otherVar = anyVar
    var dividedVar = otherVar/2.5
    println(dividedVar is Double)
}