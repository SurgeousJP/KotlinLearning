fun main(args: Array<String>) {
    var carInstance = Car()
    carInstance.name = "SurgeousJP's Lamborghini"
    carInstance.model = "Lamborghini Aventador 2023"
    carInstance.color = "Black"
    carInstance.doors = 4
    println("Car name: ${carInstance.name}")
    println("Car model: ${carInstance.model}")
    println("Car color: ${carInstance.color}")
    println("Number of car's doors: ${carInstance.doors}")
    carInstance.move()
    carInstance.stop()

    val user = User("Alexa", "Bianca", 23)
    val friend = User("John", "Smith", 30)
}
class Car{
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        println("The car $name is moving")
    }

    fun stop(){
        println("The car $name has stopped")
    }
}
