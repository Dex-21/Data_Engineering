object Conditional {
  def main(args: Array[String]): Unit = {
    //If-else condition
    val x=10
    if (x>5){
      println(s"$x is greater than 5")
    } else{
      println(s"$x is less than 5")
    }

    //If-Else as an Expression
    val y = 3
    val result = if (y % 2 ==0) "Even" else "Odd"
    println(result)

    //Ask user to input the data
    import scala.io.StdIn._
    /*println("please enter a value: ")
    //Read user input and convert to Integer
    val value = readInt()
    val result1 = if (value % 2 != 0) "Odd" else "Even"
    println(result1)
    //print integer input*/

    println("Enter your marks: ")
    val m = readInt()
    if(m >90)
    {
      println("Grade is A")
    }
    else if(m >80)
    {
      println("Grade is B")
    }
    else if (m > 70)
    {
      println("Grade is C")
    }
    else if (m > 60)
    {
      println("Grade is D")
    }
    else if (m > 50)
    {
      println("Grade is E")
    }
    else
    {
        println("F")
    }


    println("Enter your marks: ")
    val mr = readInt()
    val grade = if mr>90 then "A" else if mr>80 then "B" else if mr>70 then "C" else if mr>60 then "D" else if mr>50 then "E" else "F"
    println(grade)

  }
}
