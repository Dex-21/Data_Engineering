class Ecommerce(val name: String, val quantity: Float, val price: Float){
  def displayDetails(): Unit = {
    println(f"Product Details => Name: $name, Quantity: $quantity, Price: $price")
  }

  def buy(): Unit = {
    println(f"$name has been bought, Total Price = ${quantity * price}")
  } 
}
// Inheritance - Electronics

class Electronics(name: String, quantity: Float, price: Float) extends Ecommerce(name: String, quantity: Float, price: Float){
  override def buy(): Unit = {
    println(f"$name has been bought, Total Price = ${quantity * price}")
  }
}
//Inheritance - Books

class Books(name: String, quantity: Float, price: Float) extends Ecommerce(name: String, quantity: Float, price: Float){
  override def buy(): Unit = {
    println(f"$name has been bought, Total Price = ${quantity * price}")
  }
}
//Inheritance - Footwear

class Footwear(name: String, quantity: Float, price: Float) extends Ecommerce(name: String, quantity: Float, price: Float){
  override def buy(): Unit = {
    println(f"$name has been bought, Total Price = ${quantity * price}")
  }
}

object InheritExample2 extends App {
  val ecom = new Ecommerce("Default Product", 0, 0)
  ecom.displayDetails()
  ecom.buy()

  val electronicItem = new Electronics("Laptop", 2, 99900)
  electronicItem.displayDetails()
  electronicItem.buy()

  val bookItem = new Books("Rome", 1, 49)
  bookItem.displayDetails()
  bookItem.buy()

  val footwearItem = new Footwear("Running Shoes", 1, 800)
  footwearItem.displayDetails()
  footwearItem.buy()

}