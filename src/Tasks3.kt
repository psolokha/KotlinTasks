import kotlin.math.sqrt

fun main(args: Array<String>) {
    task12()
    task13()
    task14()
    task15()
    task16()
}

fun task12() {
    val isLeap = is_leap(2020)
    println(isLeap)
}

fun is_leap(year: Int) : String {
    return  if (year%4 == 0) "leap"
    else "common"
}

fun task13() {
    val num = staff("Jack", "Jim", "Johnnie", "William")
    println("staff counter: $num")
}

fun staff(vararg name:String): Int {
    return name.size
}

fun task14() {
    printEmployee("Ivan Ivanov", 34, true, "manager")
    printEmployee("Petr petrov", false, "administrator")
    printEmployee("Sidor Sidorov", 55, "hr")
    printEmployee("Vladimir Volodin", "director")
}

fun task15() {
    val printStr = {str:Array<String> -> for (s in str) println(s)}
    val arrStr : Array<String> = arrayOf("1","2","3","4")
    printStr(arrStr)

}

fun task16() {
    fun Double.sqrtX(): Double {return sqrt(this)}
    println(9.0.sqrtX())
}