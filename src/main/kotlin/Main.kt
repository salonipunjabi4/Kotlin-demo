
fun main()
{
    var list = (1..20).toList()
    println("List")
    println(list)
    //lambda function to filter odd numbers
    list = list.filter{ it % 2 == 0}
    println("Filtered List")
    println(list)

    var circle1 = Circle(5.0)
    var circle2 = Circle(3.5)
    var triangle1 = Triangle(4.0,4.0,4.0)
    var triangle2 = Triangle(3.0,3.0,3.0)
    var shapes = listOf(circle1, circle2, triangle1, triangle2)

    println()
    //lambda expression to filter triangles
    shapes = shapes.filter{ it.name == "Triangle"}
    println(shapes)

}