fun main(args: Array<String>) {
    // arrays in kotlin
    var names: Array<String> = arrayOf("John", "Stephen", "Megan")
    for (name in names){
        println(name)
    }
    for (i in 0 until 3) {
        println(names[i])
    }
    println("First element: ${names[0]}")
    println("The size of the array is: ${names.size}")

    // With kotlin arrays, they could have mixed type like python
    // Which called Comparable and java.io.Serializable
    var mixedElements = arrayOf(1, 2, 3, "John", 'C')
    for (mixedElement in mixedElements){
        print("$mixedElement ")
    }
    println()
    // NOTE THAT: kotlin have is to compare same as Python
    // e.g. if (name is null/Type)
}