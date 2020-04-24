fun main(args: Array<String>) {
    task17()
    task18()
    task19()
    task20()
    task21()
    task22()
    task23()
}

fun task23() {
    val myCar = Car("Nissan", "White", "A661AA50")
    println(myCar.toString())
}

data class Car(val brand: String, val color: String, val num: String) {
    override fun toString(): String {
        return "Car brand: $brand, color: $color, number: $num"
    }
}