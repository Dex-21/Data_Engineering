//In Scala programming, switch is referred as match case
import scala.io.StdIn._
object MatchCase {
  def main(args: Array[String]): Unit = {
//    def dayOfWeek(day: Int): String = day match {
//      case 1 => "Monday"
//      case 2 => "Tuesday"
//      case 3 => "Wednesday"
//      case 4 => "Thursday"
//      case 5 => "Friday"
//      case 6 => "Saturday"
//      case 7 => "Sunday"
//      case _ => "Invalid Day"
//    }
//    var day = readLine("Enter day number : ").toInt
//    println(dayOfWeek(day))

    def stringMatch(Input: String): String = Input match {
      case "Vivek" => "Mumbai"
      case "Elias" => "Ernakulam"
      case "Vighneswar" => "Kollam"
      case _ => "Invalid Input"
    }

    var inp = readLine("Enter Input : ")
    println(stringMatch(inp))
    
    
 
  }
}


