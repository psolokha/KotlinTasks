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
    println(jumbo.fuelCons)
}

abstract class Aircraft {
    abstract val maxFlightRange : Int
    abstract val capacity : Int
    abstract val fuelCons : Double
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
}

interface Passenger {
    val passengers : Int
}