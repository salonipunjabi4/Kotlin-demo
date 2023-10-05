import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) : Shape("Triangle") {
    init{
        println("$name created with $a and $b and $c")
        println("Triangle : Area ${area()}")
        println("Triangle : Perimeter ${perimeter()}")
    }
    fun area() = sqrt((perimeter()/2) * (perimeter()/2 -a) * (perimeter()/2 -b) * (perimeter()/2 -c))
    fun perimeter() = a+b+c
}