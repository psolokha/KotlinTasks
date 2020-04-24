fun task17() {
    val boeing = Aircraft2(5000, 35)
    println(boeing.fuelCons)
}

fun task18() {
    val airbus = Aircraft2(6500, 25)
    println(airbus.fuelCons)
}

fun task19(){
    println(Boeing747(350).passengers)
}

fun task20() {
    val plane = Boeing747(345)
    println(plane.passengers)
}

fun task21() {
    val jumbo = Boeing747(345)
}

fun task22() {
    val jumboJet = Boeing747(325)
    jumboJet.numPass()
}

abstract class Aircraft {
    protected abstract val maxFlightRange : Int
    protected abstract val capacity : Int
    protected abstract val fuelCons : Double
    protected abstract fun info()
}

class Aircraft2(private val maxFlightRange: Int, private val capacity: Int) {
    val fuelCons : Double
        get() = capacity.toDouble()/maxFlightRange*100
}

class Boeing747(numPass : Int) : Aircraft(), Passenger {
    override val maxFlightRange: Int = 10000
    override val capacity: Int = 50
    override val fuelCons: Double
        get() = capacity.toDouble()/maxFlightRange*100
    override val passengers : Int = numPass
    override fun info() {
        println("Number of passengers: $passengers")
    }
    override fun numPass() {
        println("Num of pass: $passengers")
    }
}

interface Passenger {
    val passengers : Int
    fun numPass()
}