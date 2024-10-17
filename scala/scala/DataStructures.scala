object DataStructures{
  def main(args: Array[String]): Unit= {
    //In  Scala, a list is an immutable , homogenous ordered sequence of elements
    // Lists are fundamental parts of a scala program.

    //Empty list declaration
    val emptyList: List[Nothing] = List()
    //List - Immutable, Homogenous, Variable Length
    val valList2:List[String]= List("Apricot","Blueberry","Cherry","Donuts","Eclairs")

    //print(valList2)

    //valList2.foreach(println)

    //Methods of List
    val firstValue = valList2.head
    val restOfValue = valList2.tail
    val lastValue = valList2.last
    val secondValue = valList2(1)
    val length = valList2.length

    //print all values
    /*
    println("Display First Value : "+ firstValue)
    println("Display Rest of the Values : "+ restOfValue)
    println("Display Last Value : "+ lastValue)
    println("Display Second Value : "+ secondValue)
    println("Display Length : "+ length)

    //valList2 = valList2:+ "fig" - Append a list is not possible, throws an error because of immutablity.
    val newList = valList2 :+ "Fig"


    //println("Is emptyList empty ? : " + emptyList.isEmpty) // return true or false

    val newValList = List("Fig", "Grapes", "Hazelnut")
    // Concatenation of List
    val fruitBasket = valList2 ++ newValList
    //println(fruitBasket)

    // Transformation of List
    val list_1 = List(1,2,3,4,5,6,7,8,9,10)
    //map
    //println(list_1.map(_+3))
    //filter
    val evenNum  = list_1.filter(_%2 ==0)
    println("Even Numbers: " + evenNum)

    val nestedList = List(List("Delhi","Kochi", "Bengaluru","Kolkata"),
                          List("Pune" ,"Mumbai","Varkala","Delhi"),
                          List("Trivandrum", "Kolkata", "Visakhapattanam","Kottayam"))

    println(nestedList)
    //identity is predefining function
    println(nestedList.flatMap(identity))

    println(list_1.filter(_%2==0).reduce(_+_))

    //Returns list of characters from length from input text
    println(fruitBasket.map(_.length))
    //Returns boolean values if string starts with string 'A'
    println(fruitBasket.map(_.startsWith("A")))


    //Sort the list by Word Length

    val sortedList = fruitBasket.sortWith(_.length < _.length) // .length is method of string
    println(sortedList)
    val sortedCity = nestedList.flatten.sortBy(_.length)
    println(sortedCity)

    println(nestedList.flatten.filter(_.startsWith("K")))
    println(nestedList.flatten.filter(_.head == 'K') ) // Alternative method



    //val city = nestedList.flatten
    println(city.take(5))
    println(city.takeRight(5))
    println(city.drop(1))
    println(city.dropRight(2))// drop last two values
    println(city.slice(1,6)) // Slicing list using start index and last position

    // Slicing list using random index  position
    val indices = List(0,2,4,5,7,9)
    //lift() - method that retrieves an element at a specified index

    println(indices.flatMap(index => city.lift(index)))

    println(city)

    val population  = List(31870000, 677000, 12430000, 14900000, 7800000, 20185000, 40000, 31870000, 1055000, 14900000, 2180000, 136000)
    val pairedList = city.zip(population)
    println(pairedList)
    */

    //Arrays - Mutable collection , indexed with sequence of elements.
    //Array provides fast access and modification comparatively, making them useful for performance of critical applications.

    val emptyArray = Array[Int]()
    val Array1 = Array(1,2,3,4,5,6)

    //Accessing individual values using index
    val firstElement = Array1(0)
    val secondElement = Array1(1)
    //Update existing value
    Array1(0) = 10
    //Array1.foreach(println)

    //getting length of an array
    println(Array1.length)

    //Adding or Removing values from an Array
    //Array1 += 7
    //Array += 3

    import scala.collection.mutable.ArrayBuffer
    val arrayBuffer = ArrayBuffer(1,2,3,4,5,6,7,8,9,10)
    arrayBuffer += 11
    arrayBuffer -= 1
    val newArray = arrayBuffer.toArray
    //newArray.foreach(println)
    //Creating an ArrayBuffer by passing an Array as elements
    val Array2 = ArrayBuffer(Array1:_*)
    //Array2.foreach(println)
    //Apply mkString to collection of Array, list etc.
    println(Array2.mkString(", "))

    //map
    val Ars = Array1.map(_+3)
    println(Ars.mkString(", "))

    //filter
    val Arp = Array1.filter(_>3)
    println(Arp.mkString(", "))

    //flatten
    val Array3= Array(Array(1,2,3),Array(2,3,4),Array(3,4,5))
    val Arf = Array3.flatten
    println(Arf.mkString(", "))

    //Slicing and Sub-String
    println(newArray.take(5).mkString(","))
    println(newArray.takeRight(2).mkString(","))
    newArray.drop(1).foreach(println)
    println(newArray.dropRight(2).mkString((",")))

    //Slicing the array using first and last index
    println(newArray.slice(1,6).mkString(","))

    //reverse the input array
    println(newArray.reverse.mkString(","))

    //Sorting an Array
    val unsorted = Array(200,134,100,245,79,368,346,907,340)
    println(unsorted.sorted.mkString(","))

  }
}
