object NestedCaseClass{
  def main(args: Array[String]): Unit ={

    case class Employee(name: String, id: Int)

    //Define a case class for a department, which contains a list of Employee
    case class Department(deptname: String, employees: List[Employee])

    //Create an instance of Employee
    val emp1 = Employee("Reshma", 123456)
    val emp2 = Employee("Maria", 156467)
    val emp3 = Employee("Vighneswar",142578)

    //Create Instance of Department
    val dep1 = Department("HR", List(emp1, emp2))
    val dep2 = Department("IT", List(emp3))

    //Pattern Matching with Another case class
    dep1  match{
      case Department(deptname ,employees) =>
        println(s"Department: $deptname")
        employees.foreach{
          case Employee(name, id) =>
            println(s"Employee: $name, Id: $id")
        }
    }
    dep2 match {
      case Department(deptname, employees) =>
        println(s"Department: $deptname")
        employees.foreach {
          case Employee(name, id) =>
            println(s"Employee: $name, Id: $id")
        }
    }
  }
}
