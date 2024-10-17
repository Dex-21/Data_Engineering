import scala.io.StdIn._
object Calculator {
  def main(args: Array[String]): Unit = {
    def calculatorMatch(a: Int, b: Int, Op: Char): Any= Op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => if a==0 || b == 0 then 0 else a / b
      case '^' => Math.pow(a, b).toInt
      case '%' => a % b
      case _ => "Invalid operator"
    }
//    var a = readLine("Enter Input : ").toInt
//    var b = readLine("Enter Input : ").toInt
//    var op = readLine("Enter Input : ").
      println(calculatorMatch(10,0,'/'))
  }
}
