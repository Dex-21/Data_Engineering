object Loops {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer
    import scala.io.StdIn._
    // A simple while loop syntax that print numbers from 1 to 10
    /*var variable = 1
    while (variable < 10){
      println(variable)
      variable += 1
    }

    //For Loop
    val fruits = List("Apple","Banana","Cherry","Dates","Orange")

    for (fruit <- fruits){
      println(fruit)
    }

    for (i <- 1 to 10) {
      println(i)
    }

    for (i <- 1 to 10 by 2) {
      println(i)
    }
   
    val food_list = List("idli","vada","dosa", "uttapam","biriyani","chocolate","curd")
    for (food <- food_list){
      println(food)
    }
    
    
    //Filtering records in for loop using if condition

    //1. Write a Scala program to create a collection of even array
    
    import scala.collection.mutable.ArrayBuffer
    val evenArray = ArrayBuffer[Int]()
    for(m <- 1 to 20 if m % 2 == 0){
      evenArray += m
    }
    println(evenArray.mkString((", ")))
    
    //2. Write a scala program to show collection of  prime number between 1 to 100. 
    import scala.collection.mutable.ArrayBuffer
    val primeArray = ArrayBuffer[Int]()
    for (p <- 1 to 100){
      if (p >1) {
        var primeFlag =true
        for (f <- 2 to math.sqrt(p).toInt) {
          if (p % f == 0) {
            primeFlag = false
          }
        }
        if primeFlag == true then primeArray += p 
      }  
    }
    println(primeArray.mkString((", ")))
   */ 
    
    //3. Fibonacci series
    
    var a = 0
    var b = 1
    var i = 1
    val fibArray = ArrayBuffer[Int](a,b)
    while (i < 10){
      var c = a + b 
      fibArray += c
      a = b
      b = c
      i += 1
    }
    println(fibArray.mkString(", "))
    
    // 4.Find the next prime number after given prime number
    
    println("Enter the prime number : ")
    var pr = readInt()
    var primeFlag = true
    while(primeFlag){
      pr += 1
      var count =0
      for (k <- 2 to math.sqrt(pr).toInt ){
        if (pr % k == 0) {
          count += 1
        }
      }
      if count == 0 then primeFlag = false
    }
    println(pr)
    
    
    
    
  }
}


