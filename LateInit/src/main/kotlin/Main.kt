fun main(args: Array<String>) {
    var user = User("SurgeousJP", "Unknown", 20)

    // Note that if U don't use it, kotlin will throw UninitializedPropertyAccessException
    user.favoriteMovie = "Interstellar"

    println(user.favoriteMovie)
}

// LateInit keyword
// Only work for non-primitive CLASSES (string, array, ...)
// Sometimes, you don't want to include the property as constructor
// and don't want to assign its own values directly in class
// And that's when lateinit come into work !

class User(var firstName: String, var lastName: String, var age: Int){
    lateinit var favoriteMovie: String
}
