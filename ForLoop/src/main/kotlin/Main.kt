fun main(args: Array<String>) {
    // Simple for loop with index
//    for (i in 1..10){
//        println("i = $i")
//    }
    // Using until gives a very good memory of C++ for loops lol
    // Forward loop
    for (i in 1 until 10){
        println("i = $i")
    }
    // Downward loop
    for (i in 10 downTo 1){
        println("i = $i")
    }
    // Include steps in for loop
    for (i in 1 until 10 step 2){
        println("i = $i")
    }
}