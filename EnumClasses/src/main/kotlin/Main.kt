fun main(args: Array<String>) {
    // accessing enum values
    println("This is west direction : ${Direction.WEST}")
    println("This is east direction : ${Direction.EAST}")

    // Iterates through all values in enum class
    for (direction in DirectionProperty.values()){
        // Access enum values
        println(direction)
        // Access enum values' properties
        println("Direction: " + direction.direction)
        println("Distance: " + direction.distance)
    }

    // Calls function in enum class
    DirectionProperty.EAST.printData()
}

// enum class
enum class Direction{
    // Define enum values
    NORTH, SOUTH, EAST, WEST
}

// enum class with properties
enum class DirectionProperty(var direction: String, var distance: Int){
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    // Define function in enum class
    fun printData(){
        println("Direction = $direction and Distance = $distance")
    }

}