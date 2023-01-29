fun main(args: Array<String>) {
    // Operators have similar pattern to C++
    var x = 5
    var y = 3.0
    // Use ${expression} to calculate and display value
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")
    // Kotlin supports expression assign value
    var result = x
    result += 2
    println("result of x + 2: $result")
    // Kotlin also supports increment, decrement operator
    println("x++ = ${x++}")
    println("x = $x")
    println("--x = ${--x}")
}