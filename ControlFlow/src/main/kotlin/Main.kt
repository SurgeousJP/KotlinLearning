fun main(args: Array<String>) {
    val alarm = 12

    // Same as switch case in C++
    when(alarm){
        // 12, 7, 4 -> println("The time is $alarm") // supports multiple value for condition
        // Using two dots .. -> take a range
        in 1..10 -> println("The time is $alarm")
        else -> println("The time is $alarm")
    }
    // you can also assign values using when-expression
    val text = when(alarm){
        in 1..10 ->{
            "The number is in the range 1 .. 10"
        }
        12, 14 ->{
            "The time is $alarm"
        }
        else ->{
            "The time is $alarm"
        }
    }
    println(text)
}