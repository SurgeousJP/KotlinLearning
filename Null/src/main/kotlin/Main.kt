fun main(args: Array<String>) {
    // all variables are not nullable by default
    // you can assign null with a question mark, just like C#, but it must have a type
    var text: String? = "Name"
    // If you don't check null, it will have an error and don't let you call it
    // Wrong
    // println(text.length)
    // Right
    if (text != null){
        println(text.length)
    }
    else{
        println("The variable is null")
    }
    // But u can call it by adding a question mark like you do with variable
    var text2: String? = "Name"
    text = null
    println(text?.length)
}