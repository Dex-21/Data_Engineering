class Employee(private var empname: String, private var salary: Int){
  // Data
  //Set Method
  def setName (newEmpName: String): Unit= {
    if (newEmpName.nonEmpty) empname= newEmpName
  }
  //getter
  def getName: String = empname
  //Set Method
  def setSalary(newSal: Int): Unit = {
    if (newSal > 0) salary = newSal
  }
  //getter  
  def getSalary: Int = salary

}

object Encapsulation extends App{
  val emp1 = new Employee("Sam", 20000)
  emp1.setName("George")
  emp1.setSalary(30000)
  println(emp1.getName)
  println(emp1.getSalary)
}
