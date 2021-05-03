object User {

  def main(args : Array[String]) {
    //object
    val user1 = User
    println(user1)
    //class with constructor
    val point1 = new Point(2, 3)
    println(point1.x) // 2
    println(point1) // prints (2, 3)

    //class Constructor with Default value
    val origin = new PointDafault // x and y are both set to 0
    val point2 = new PointDafault(y=2)
    println(point2.x + " " + point2.y) // prints 1
  }

}

class Point(var x: Int, var y: Int) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}


class PointDafault(var x: Int = 0, var y: Int = 0) {
  override def toString: String =
    s"($x, $y)"
}


