package collections

object Vectors {
  /*
  Scala Vector is a general purpose immutable data structure where elements can be accessed randomly.
  It is generally used for large collections of data.
   */

  def main(args: Array[String]): Unit = {
    var vector: Vector[String] = Vector("Zara","Nuha","Ayan");
    // Add an element
    var vector1: Vector[String] = vector :+ "Naira";
    // Reverse an element
    var vector2: Vector[String] = vector.reverse;
    // sort a vector
    var vector3: Vector[String] = vector1.sorted;
    println(vector);
    println(vector1);
    println(vector2);
    println(vector3);

  }
}
