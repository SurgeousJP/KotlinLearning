fun main(args: Array<String>) {
    // while loop
    var loopEndCondition = 10
    var iterator = 1
    // while loop
    while (iterator < loopEndCondition){
        print("$iterator ")
        iterator++
    }
    println()
    iterator = 1
    // do while
    do{
        print("$iterator ")
        iterator++
    }while (iterator < loopEndCondition)
    // continue
    println()
    iterator = 1
    while (iterator < loopEndCondition){
        if (iterator == 7){
            iterator++
            continue
        }
        print("$iterator ")
        iterator++
    }
    // break
    println()
    iterator = 1
    while (iterator < loopEndCondition){
        if (iterator == 7){
            break
        }
        print("$iterator ")
        iterator++
    }
}