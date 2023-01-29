fun main(args: Array<String>) {
    sayHello()
    sayHelloWithParameters("SurgeousJP")
    println("This is 1: ${returnConstant1()}")
    println(getMax(3, 6))
    println(getMax(3.14F, 6.6F))
    sendMessage("SurgeousJP", "The best to U")
    sendMessage("SurgeousJP")
}

// function name for kotlin is fun ~ def (python)
// no parameter
fun sayHello() {
    println("Hello guys, welcome")
}

// note that, you can't reassign parameter normally since they're seen as val
//fun sayHelloError(name: String){
//    name = "Who the heck are U"
//    print("Hello $name")
//}

// with parameters, you need to include its type
fun sayHelloWithParameters(name: String){
    println("Hello $name")
}

// to return data from function, you must include a return type
fun returnConstant1() : Int{
    return 1
}

// Overload function
fun getMax(a: Int, b: Int) = if (a > b) a else b
fun getMax(a: Float, b: Float) = if (a > b) a else b

// Default parameters, some kind same as assign variables
fun sendMessage(name: String, message: String = "Hello"){
    println("Name = $name and message = $message")
}


// Some interesting shortcut
// Ctrl + Y => remove line as C# Ctrl + Shift + L
// Ctrl + / => comment code
// Ctrl + D => duplicate a line