object Collections {

  //Scala Lists
  //Source: https://www.geeksforgeeks.org/scala-lists/

  def main(args:Array[String])
  {
    // Creating and initializing immutable lists
    val mylist1: List[String] = List("A", "B", "C", "D")
    val mylist2 = List("C", "C#", "Java", "Scala", "PHP", "Ruby")

    // Display the value of mylist1
    println("List 1:")
    println(mylist1)
    mylist1.foreach(println)

    // Display the value of mylist2 using for loop
    println("\nList 2:")
      for(mylist<- mylist2)
    {
      println(mylist)
    }
  }


}
