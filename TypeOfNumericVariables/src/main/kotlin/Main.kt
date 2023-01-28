import kotlin.math.max

fun main(args: Array<String>) {
    // With integers type, you have Int, Byte, Short, Long
    val minIntegerValue = Int.MIN_VALUE
    val maxIntegerValue = Int.MAX_VALUE
    println("Integer minimum value is $minIntegerValue")
    println("Integer maximum value is $maxIntegerValue")

    val minByteValue = Byte.MIN_VALUE
    val maxByteValue = Byte.MAX_VALUE
    println("Byte minimum value is $minByteValue")
    println("Byte maximum value is $maxByteValue")
    // It's the same for Short and Long, so I'll pass :>

    // Floating Numbers : Float, Double
    // With float number U have to include an 'f' suffix
    // since Kotlin automatically recognize it as a double
    var floatNumber = 2.5f
    var doubleNumber = 2.5
    println("Float number: $floatNumber")
    println("Double number: $doubleNumber")
}