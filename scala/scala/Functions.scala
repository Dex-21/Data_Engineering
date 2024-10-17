object Functions {
  import scala.io.StdIn._
  def main(args: Array[String]): Unit = {

    //Function - A block of code which must do a certain task and can be used repeatedly.


    //1. Create a function which takes username as input and print greetings.
    // Declare a Function - UDF(User Defined Function)
    //Function takes one parameter
    /*
    def greetings(name : String): Unit = {

      println(s"Hello $name. Welcome to UST")
    }
    println("Enter username: ")
    val name = readLine()
    //Call a function with user's input.
    //greetings(name)


    //2.Create a basic function which takes more than one parameter.
    var a = readInt()
    var b = readInt()
    def add(a: Int, b: Int): Int = {

      a + b
    }
    println(add(a, b))

    //Alternative

    var x = readLine("Enter first").toInt
    var y = readLine("Enter second").toInt
    def ad(a: Int, b: Int): Int = {

      a + b
    }

    println(ad(x, y))



    //3. Calculator

    def calculator(a: Int, b:Int, op:String): Any = {
      if (op == "+"){
        return a + b
      }
      if (op == "-"){
        return a - b
      }
      if (op == "*") {
        return a * b
      }
      if (op == "/"){
        return a / b
      }
    }

    var x = readLine("Enter first").toInt
    var y = readLine("Enter second").toInt
    var op = readLine("Enter Operation: ")
    println(calculator(x, y, op))



    //4.Declare a function with default value

    def divide(a: Int,b: Int = 6): Any ={
      return a / b
    }

    var x = readLine("Enter first").toInt
    var y = readLine("Enter second").toInt
    //println(divide(x))
    //println(divide(x, y))


    //5. Lambda Function or Anonymous Function
    var add = (a: Int, b: Int) => a + b
    println(add(x,y))

    //6. Higher order function : Function passed as a parameter
    def applyFunction(f: (Int, Int) => Int, value1: Int, value2: Int): Int = {
      f(value1 , value2)
    }
    println(applyFunction(add, x, y))
    */
    //7. Create a function that takes a list as input and returns a list without duplicate entries

//    def removeDup(li : List[Int]): Any = {
//      li.distinct
//    }
//    val A = List(13, 8 , 13, 4, 6, 8)
//    println(removeDup(A))

    // 8. Write a function that test user input is Palindrome

//    def ispalindrome(str: String): Boolean= {
//      return str == str.reverse
//    }
//    println(ispalindrome("RAMAN"))


    // 9.Create a scala function which returns factorial of a number
    
    def factorial(n :Int): Int ={
      if (n == 0) 1
      else n * factorial(n-1)
    }
    println(factorial(5))



  }
}
