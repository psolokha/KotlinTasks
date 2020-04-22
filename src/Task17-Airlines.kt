fun task17() {
    val boeing = Aircraft()
    println(boeing.fuelCons)
}

fun task18() {
    val airbus = Aircraft2(13245, 6500, 25)
    println(airbus.fuelCons)
}

fun task19(){
    println(Boeing747(350).passengers)
}

fun task20() {
    val plane = Boeing747(345)
    println(plane.passengers)
}

open class Aircraft {
    val planeID : Int = 12345
    val maxFlightRange : Int = 6000
    val capacity : Int = 30
    var fuelCons : Double = 0.5
        get() = capacity.toDouble()/maxFlightRange*100
}

class Aircraft2(val planeID : Int, val maxFlightRange : Int, val capacity : Int) {
    var fuelCons : Double = 0.5
        get() = capacity.toDouble()/maxFlightRange*100
}

class Boeing747(val numPass : Int) : Aircraft(), Passenger {
    override val passengers : Int
    init {
        passengers = numPass
    }
}

interface Passenger {
    val passengers : Int
}