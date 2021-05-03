 // Scala program to illustrate for loop
  object Loops {

    // Main Method
    def main(args: Array[String]) {

      var y = 0;

      // for loop execution with range
      for(y <- 1 to 4)
      {
        println("Value of y is: " + y);
      }

      //iterating array
      var i =  Array(1, 2, 3)

      println(i.getClass)
      for(p <- i) {
        println("Value of p is: " + p);
      }




    }
  }


