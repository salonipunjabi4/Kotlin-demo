open class Shape(var name: String) {

    constructor(name: String, vararg dimensions: Double) : this(name)
    init {
        //println("I am super class")
    }

    fun changeName(newName: String){
        name = newName
    }
}