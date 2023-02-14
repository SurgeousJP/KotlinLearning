fun main(args: Array<String>) {
    println(Calculator.sum(11, 3))
    println(Calculator.maxValue)
}

class Calculator(){
    // A way to define and use function, variables by calling the classes
    // without using class instances
    // It's kinda static variables and functions
    companion object{
        val maxValue = 999
        fun sum(a: Int, b:Int):Int{
            return a + b
        }
    }
}