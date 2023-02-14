fun main(args: Array<String>) {
    val car = Car("BMW", "BLUE", 4, 4)
    val plane = Plane("Boeing", "WHITE", 2, 2)
    car.move()
    plane.move()
    plane.stop()
}
// Inorder to allow a class to be inheritable, include the "open" keyword
// If you want class to be final (can't be inherited) => "final" keyword
open class Vehicle(val name: String, val color: String){
    // include open to allow override methods
    open fun move(){
        println("$name is moving")
    }

    open fun stop(){
        println("$name has stopped")
    }
}
// Inheriting from superclass (Vehicle)
class Car(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color){

}

class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color){
    override fun move() {
        flying()
        super.move()
    }

    private fun flying(){
        println("The plane is flying")
    }
}