    //Define a Class
    class Car(val make: String, val model: String, var year: Int) {

      def displayInfo(): Unit = {
        println(s"Car Info: $year $make $model")
      }
    }
    //Create an object of Class Car
    //Singleton object extends App (trait) which does not need main() anymore
    object SimpleClass extends App {
      val car = new Car("Hyundai", "Creta",2023)
      car.displayInfo()
      car.year =2024
      car.displayInfo()
    }
  
