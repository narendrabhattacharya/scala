package collections

object Arrays {

  def main(args: Array[String]) {

    //Arrays
    val a1 = Array(1, 2, 3)
    println(a1.mkString(" "))
    val a2 = a1 map (_ * 3)
    println(a2.mkString(" "))
    val a3 = a2 filter (_ % 2 != 0)
    println(a3.mkString(" "))
    val a4 = a3.reverse
    println(a4.mkString(" "))

    //Sequence
    val seq: Seq[Int] = a1
    print(seq.getClass)
    val a5: Array[Int] = seq.toArray
    print(a5.mkString(" "))
  }

}
