package collections

object Lists {

  //Scala Lists
  //Source: https://www.geeksforgeeks.org/scala-lists/
  /*
  A list is a collection which contains immutable data. List represents linked list in Scala. The Scala List class holds a sequenced, linear list of items.
Following are the point of difference between lists and array in Scala:

Lists are immutable whereas arrays are mutable in Scala.
Lists represents a linked list whereas arrays are flat.
Syntax:

val variable_name: List[type] = List(item1, item2, item3)
or
val variable_name = List(item1, item2, item3)
Some important points about list in Scala:

In a Scala list, each element must be of the same type.
The implementation of lists uses mutable state internally during construction.
In Scala, list is defined under scala.collection.immutable package.
A List has various methods to add, prepend, max, min, etc. to enhance the usage of list.

   */

  def main(args: Array[String]) {
    // Creating and initializing immutable lists
    val mylist1: List[String] = List("A", "B", "C", "D")
    val mylist2 = List("C", "C#", "Java", "Scala", "PHP", "Ruby")

    // Display the value of mylist1
    println("List 1:")
    println(mylist1)
    //printing list
    mylist1.foreach(println)

    // Display the value of mylist2 using for loop
    println("\nList 2:")
    for (mylist <- mylist2) {
      println(mylist)
    }

    // Creating an Empty List.
    var emptylist: List[String] = List()
    println("The empty list is:")
    println(emptylist)

    // Creating a two-dimensional List.
    val twodlist: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
    println("The two dimensional list is:")
    println(twodlist)


    //Basic Operations on Lists
    println(mylist1.head)
    println(mylist1.tail)
    println(emptylist.isEmpty)
    //fill creates a list and fills it with zero or more
    emptylist = List.fill(3)("Scala")
    emptylist.foreach(println)

    val mylist1new = mylist1.reverse
    mylist1new.foreach(println)

    //merge lists in scala
    //By using ++
    val mylistmerged1 = mylist1 ++ mylist2
    mylistmerged1.foreach(println)
    //By using :::
    val mylistmerged2 = mylist1 ::: mylist2
    mylistmerged2.foreach(println)
    //By using concat method
    val mylistmerged3 = List.concat(mylist1, mylist2)
    mylistmerged3.foreach(println)
  }


}
