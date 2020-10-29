package collections

import scala.collection.mutable.ListBuffer

object ListBuffers {
/*
Source : https://www.geeksforgeeks.org/scala-listbuffer/
https://www.tutorialspoint.com/scala_collections/scala_collections_listbuffer.htm
A list is a collection which contains immutable data. List represents linked list in Scala.
A List is immutable, if we need to create a list that is constantly changing, the preferred approach is to use a ListBuffer.
The Scala List class holds a sequenced, linear list of items.
A List can be built up efficiently only from back to front.
the ListBuffer object is convenient when we want to build a list from front to back. It supports efficient prepend and append operations.

Once we are done creating our list, call the toList method. To convert the ListBuffer into a List, Time taken will be constant.
To use ListBuffer, scala.collection.mutable.ListBuffer class is imported, an instance of ListBuffer is created.
 */
//SAMPLE CODE

  //var name = new ListBuffer[String]()  // empty buffer is created
  def main(args: Array[String]) {
    var myList = ListBuffer("Ajay", "Ram", "Shyam")
    myList(0)="new"
    print(myList)
    // Add an element
    myList += "Welcome";
    // Add two element
    myList += ("To", "Tutorialspoint");
    println(myList);
    // Remove an element
    myList -= "Welcome";
    // print second element
    println(myList(1));
    println(myList)
    println("test")

  }

}
