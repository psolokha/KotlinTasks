fun task17() {
    val boeing = Aircraft()
    println(boeing.fuelCons)
}

class Aircraft {
    val planeID : Int = 12345
    val maxFlightRange : Int = 6000
    val capacity : Int = 30
    var fuelCons : Double = 0.5
        get() = capacity.toDouble()/maxFlightRange*100
}