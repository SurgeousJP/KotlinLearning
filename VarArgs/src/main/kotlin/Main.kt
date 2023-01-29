fun main(args: Array<String>) {
    PrintAllNums(1, 2, 3, 4, 5, 6)
}
// Using vararg to pass as number of parameters is unknown, but same type
fun sum(vararg numbers: Int): Int{
    var result = 0
    // For loop in kotlin is similar to foreach in C#
    for (number in numbers){
        result += number
    }
    return result
}
// Foreach in kotlin
fun PrintAllNums(vararg numbers: Int){
    numbers.forEach{println(it)}
}
