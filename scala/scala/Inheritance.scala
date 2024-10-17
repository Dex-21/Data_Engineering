//Parent Class
class Animal(val name: String){
  
  def makeSound(): Unit = {
    println(s"$name makes sound")
  }
}
//Subclass
class Dog(name: String) extends Animal(name){
  override def makeSound(): Unit = {
    println(s"$name make sound : Woof!")
  }
}

object InheritExample extends App{
  val animal = new Animal("Donkey")
  animal.makeSound()
  val dog = new Dog("Loki")
  dog.makeSound()
}