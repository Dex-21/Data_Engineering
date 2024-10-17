//Traits
//A trait is a special kind of class used to define collection of methods
//and field names that can be reused across different classes.

//Traits usage: Code reusablity in Scala. Instead of duplicating code in multiple classes
//you can define commom functionality in a trait then mix it with any class 

//scala doesnot support multiple inheritance. (A class inherited from more than one class)
//But traits helps you to achieve this . A class can extend one class and mix it with multiple traits.

trait Drivable {
  def drive(): Unit = {}
}

trait Flyable{
  def fly(): Unit= {
    println("Flying in the sky")
  }
}

class car(val make: String, val model: String) extends Drivable{
  override def drive(): Unit = {
    println(s"Driving a $make $model")
  }
}

class Airplane(val make: String, val model: String) extends Flyable with Drivable{
  override def drive(): Unit = {
    println("Taxing on the runway")
  }
  override def fly(): Unit ={
    println(s"Airplane is Flying at 30000 ft.")
  }
}
