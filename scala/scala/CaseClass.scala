//Define case class
//Case classes in Scala programming are special kind of classes that are used for modelling immutable data structures.
//Case class will automatically provides useful methods: toString, equals, hashCode, built-in support for pattern matching.

//case class Person(name: String, age: Int)
//
////Main Object
//object Main extends App{
//  //Create object of case class
//  val person = Person("Tom", 20)
//  
//  //Define a function to describe a person 
//  //Case Class is used for pattern matching
//  def describePerson(person: Any): String = person match {
//    case Person(name, age) => s"Person Name: $name, Age: $age"
//  }
//
//  // Test Functionality
//
//  println(describePerson(person))
//}
object CaseClass{
  def main(args: Array[String]): Unit = {

    //Define a case class

    case class Employee(name: String, age: Int)

    //Create an Instance (object) of case class
    val obj = Employee("Melissa", 20)

    //Access Fields

    println(obj.age)
    println(obj.name)

    //Pattern Matching

    obj match {
      case Employee(name, age) => println(s"Name: $name , Age: $age")
    }

    //Create a copy with modified fields

    val olderObj = obj.copy(name = "Anu")
    println(olderObj)
  }
}

























//case class Person(name: String, age: Int){
//  object CaseClass extends App{
//    // Create an instance of case class
//    val person1 = Person("Tom", 10)
//    val person2 = Person("Raju", 12)
//    
//    println(person1)
//    println(person2)
//    
//    //copy a case class
//    val person3 = person1.copy(age = 20)
//    println(person3)
//    
//    
//    //Pattern Matching with Case class
//    person1 match{
//      case Person(name, age) => println(s"Name: $name,Age: $age")
//    }
//  }
//}
