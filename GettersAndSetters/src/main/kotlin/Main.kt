fun main(args: Array<String>) {
    var testUser = User("SurgeousJP")
    println("First name: ${testUser.firstName}")
    println("Last name: ${testUser.lastName}")
    println("Age: ${testUser.age}")
    testUser.firstName = "ChangeNamePLS"
}
class User(firstName: String, var lastName: String = "LastName", var age: Int = 0){
    // In kotlin you define getter, setter right below property
    // In getter and setter, the property data is field, value is the val you assign to property
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }
        set(value){
            println("$value was assigned to firstName property")
            field = value
        }
}