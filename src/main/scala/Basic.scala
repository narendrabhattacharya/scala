object Basic {

  def main(args: Array[String]) {

    //Expressions are computable statements
    println(1)
    println(1 + 1)
    println("Hello")
    println("Hello," + "World")
    //values
    var x = 1 + 2
    println(x)
    var y: Float = 1.0f + 1.0f
    println(y)

    //Blocks
    println({
      val x = 1 + 1
      x + 1
    }) // 3

    var s = "Hello"
    println({
      var c = "India!!!!"
      s + " " + c
    }) // 3

    //Functions
    var addOne = (x: Int) => x + 1
    println(addOne(8))

    val addTwo = (x: Int, y: Int) => x + y
    println(addTwo(1, 2)) // 3

    //Methods
    def add(x: Int, y: Int): Int = x + y

    println(add(1, 2)) // 3

    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier

    println(addThenMultiply(1, 2)(3)) // 9

    def name: String = System.getProperty("user.name")

    println("Hello, " + name + "!")

    def getSquareString(input: Double): String = {
      val square = input * input
      square.toString
    }

    println(getSquareString(2.5)) // 6.25

    //Classes
    class Greeter(prefix: String, suffix: String) {
      def greet(name: String): Unit =
        println(prefix + name + suffix)
    }
    val greeter = new Greeter("Hello, ", "!")
    greeter.greet("Scala developer") // Hello, Scala developer!

    class User

    val u1 = new User

    case class Point(x: Int, y: Int)

    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)

    //compared by value not by reference
    if (point == anotherPoint) {
      println(point + " and " + anotherPoint + " are the same.")
    } else {
      println(point + " and " + anotherPoint + " are different.")
    } // Point(1,2) and Point(1,2) are the same.

    if (point == yetAnotherPoint) {
      println(point + " and " + yetAnotherPoint + " are the same.")
    } else {
      println(point + " and " + yetAnotherPoint + " are different.")
    } // Point(1,2) and Point(2,2) are different.


    //Objects
    //singleton of own class
    object IdFactory {
      private var counter = 0

      def create(): Int = {
        counter += 1
        counter
      }
    }

    val newId: Int = IdFactory.create()
    println(newId) // 1
    val newerId: Int = IdFactory.create()
    println(newerId) // 2



  }





}

//Trait
trait Greeters {
  def greet(name: String): Unit
}

//Traits can also have default implementations:
trait Greeter {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

class DefaultGreeter extends Greeter {

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

val greeter = new DefaultGreeter()
greeter.greet("Scala developer") // Hello, Scala developer!

val customGreeter = new CustomizableGreeter("How are you, ", "?")
customGreeter.greet("Scala developer") // How are you, Scala developer?
}