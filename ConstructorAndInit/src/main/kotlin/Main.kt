fun main(args: Array<String>) {
    var userDefault = UserSecond()
    userDefault.printAll()
    var userSecondConstructorOne = UserSecond("SurgeousJP")
    userSecondConstructorOne.printAll()
    var userSecondConstructorTwo = UserSecond("SurgeousJP", "Ayaka")
    userSecondConstructorTwo.printAll()
    // Test default parameters
    var testDefaultClass = ClassTestDefaultValues("SurgeousJP")
    testDefaultClass.printParameters()
}
// You can create constructor by pass parameter in class header, e.g.
// This is called Primary Constructor
class Bird(specie: String, canFly: Boolean = true){
    // if you include in class header, you don't need to include in class body
    var specie = ""
    var canFly = false
}
// Due to primary constructor can't contain any code
// use init{} block to initialize it
// The process: Primary constructor -> init{} -> Secondary Constructor
class User(var firstName: String, var lastName: String, var age: Int){
    init{
        if (firstName.toLowerCase().startsWith("a")){
            this.firstName = firstName
        }
        else{
            this.firstName = "User"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }
}
// Second Constructor
class UserSecond(){
    var userName = ""
    var userLastName = ""

    // parameters are val
    constructor(name: String) : this(){
        userName =  name
    }
    constructor(name: String, lastName: String) : this(){
        userName = name
        userLastName = lastName
    }

     fun printAll(){
         println("Username: $userName")
         println("UserLastName: $userLastName")
     }
}
// Constructor Parameters Default Values
class ClassTestDefaultValues(name: String, testDefaultValue: String = "DefaultValue"){
    var userName = name
    var userDefaultValue = testDefaultValue
    fun printParameters(){
        println(userName)
        println(userDefaultValue)
    }
}