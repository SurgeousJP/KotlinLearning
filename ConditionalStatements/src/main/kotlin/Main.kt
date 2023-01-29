fun main(args: Array<String>) {
    // Same as C++
    var isActive = true
    if (isActive){
        println("The user is active")
    }
    else{
        println("The user is not active")
    }

    var aRandomState = 42
    if (aRandomState == 42){
        println("The joke comes true LOL")
    }
    else{
        println("If Fails huh :>")
    }

    // Less than or equal to
    if (aRandomState >= 42){
        println("Correct !")
    }
    else{
        println("Fails T_T")
    }

    // && AND operator
    if (aRandomState == 41 && isActive == true){
        println("Test AND operator successfully")
    }
    else{
        println("Fails")
    }
    // || OR operator
    if (aRandomState == 42 && isActive == false) {
        println("Test OR operator successully")
    }
    else{
        println("Oops")
    }
}