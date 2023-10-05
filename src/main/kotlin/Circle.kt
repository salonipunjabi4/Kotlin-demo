import kotlin.random.Random

class Circle(val radius: Double): Shape("circle") {
    val pi = 3.141592

    companion object{
        fun randomCircle(): Circle{
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    init{
        println("$name with radius: ${radius}")
        println("$name : Area ${area()}")
        println("$name : Perimeter ${perimeter()}")

    }
    fun area() = radius * radius * pi
    fun perimeter() = 2 * radius * pi
}