package Scala

object Datatypes{
  //Primitive Datatypes
  def main(args: Array[String]): Unit= {
    val age: Int = 25
    var myValue: Double = 23.56287899
    var longIntVal: Long = 453673838L
    var myFloatValue: Float = 43.25F


    //Character and String type
    var message: String = "Hello Scala"
    var charValue: Char = 'A'

    //Byte
    var byteValue: Byte = 127
    //Mutable Datatypes
    //Boolean
    val booleanValue1: Boolean = true
    val booleanValue2: Boolean = false

    println("Integer Value : "+age)
    println("Double Datatype : "+myValue)
    println("String Datatype : "+message)
    println("Boolean Datatype : "+booleanValue1)
    
    //Re-initialize value
    charValue='B'
    //age=101 //Cannot be reassigned to int value
    println("Character New Value : "+charValue)
    
  }
}



