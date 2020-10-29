package collections

import scala.collection.immutable.ListSet

object ListSets {
  /*
  Scala Set is a collection of pairwise different elements of the same type.
  In other words, a Set is a collection that contains no duplicate elements.
  ListSet implements immutable sets and uses list structure. Elements insertion order is preserved while storing the elements.
   */

  def main(args: Array[String]): Unit = {

    var myList: ListSet[String] = ListSet("Zara","Nuha","Ayan");
    // Add an element
    var myList1: ListSet[String] = myList + "Naira";
    // Remove an element
    var myList2: ListSet[String] = myList - "Nuha";
    // Create empty set
    var myList3: ListSet[String] = ListSet.empty[String];
    println(myList);
    println(myList1);
    println(myList2);
    println(myList3);

  }

}
