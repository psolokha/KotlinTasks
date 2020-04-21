fun main(args: Array<String>) {
    task12()
}

fun task12() {
    val isLeap = is_leap(2020)
    println(isLeap)
}

fun is_leap(year: Int) : String {
    return  if (year%4 == 0) "leap"
    else "common"
}
