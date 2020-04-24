package finaltask

fun main(args : Array<String>) {
    val hangar : MutableList<Aircraft> = mutableListOf (
            Boeing747(350),
            AirbusA380(375),
            Antonov225(200)
    )
    ui(hangar)
}

abstract class Aircraft {
    protected abstract val maxFlightRange : Int
    protected abstract val capacity : Int
    protected abstract val fuelCons : Double
    fun info() {
        println("Model: ${this.javaClass.simpleName}\nFlight distance: $maxFlightRange\nFuel consumption: $fuelCons")
        if (this is Passenger) numPass()
        if (this is Cargo) printMaxWeight()
    }
}

class Boeing747(numPass : Int) : Aircraft(), Passenger {
    override val maxFlightRange: Int = 10000
    override val capacity: Int = 50
    override val fuelCons: Double
        get() = capacity.toDouble()/maxFlightRange*100
    override val passengers : Int = numPass
    override fun numPass() {
        println("Num of pass: $passengers")
    }
}

class AirbusA380(numPass: Int) : Aircraft(), Passenger {
    override val maxFlightRange: Int = 12000
    override val capacity: Int = 45
    override val fuelCons: Double
        get() = capacity.toDouble()/maxFlightRange*100
    override val passengers : Int = numPass
    override fun numPass() {
        println("Num of pass: $passengers")
    }
}

class Antonov225(override val maxWeight: Int) : Aircraft(), Cargo {
    override val maxFlightRange = 15000
    override val capacity = 75
    override val fuelCons: Double
        get() = capacity.toDouble()/maxFlightRange*100

    override fun printMaxWeight() {
        println("Max weight: $maxWeight")
    }
}

interface Passenger {
    val passengers : Int
    fun numPass()
}

interface Cargo {
    val maxWeight : Int
    fun printMaxWeight()
}

fun ui(hangar: List<Aircraft>) {

    println("-----------------------------")
    println("Выберите действие:")
    println("1. Отобразить список самолетов")
    println("2. Отобразить общее кол-во самолетов в ангаре")
    println("0. Выйти из программы")
    println("-----------------------------")
    val ch = readLine()
    when (ch) {
        "1" -> {
            println("Самолеты в ангаре:")
            for(i in 0 until hangar.size) println("${i+1}. ${hangar[i].javaClass.simpleName}")
            println("")
            println("Выберите действие:")
            println("1 - ${hangar.size} Отобразить информацию о самолете")
            println("9. Вернуться в предыущее меню")
            println("0. Выйти из программы")
            println("-----------------------------")
            val ch2 : Int? = readLine()?.toInt()
            when (ch2) {
                in 1 .. hangar.size -> {hangar[ch2!!-1].info()}
                9 -> {ui(hangar)}
                0 -> {return}
                else -> {
                    println("Введено неправильное значение.\nВозврашаемся в главное меню...\n*Нажмите любую клавишу*")
                    readLine()
                    ui(hangar)
                }
            }
        }
        "2" -> {
            println("общее кол-во самолетов в ангаре: ${hangar.size}")
            for (plane in hangar) print("${plane.javaClass.simpleName}\t")
            println("")
            println("Выберите действие:")
            println("9. Вернуться в предыущее меню")
            println("0. Выйти из программы")
            println("-----------------------------")
            val ch2 = readLine()
            when (ch2) {
                "9" -> {ui(hangar)}
                "0" -> {return}
                else -> {
                    println("Введено неправильное значение.\nВозврашаемся в главное меню...\n*Нажмите любую клавишу*")
                    readLine()
                    ui(hangar)
                }
            }
        }
        "0" -> {
            println("Всего доброго!\nПриходите еще!")
            return
        }
        else -> {
            println("Неправильное значение.\nПовторите выбор (1,2 или 0)")
            ui(hangar)
        }
    }
}