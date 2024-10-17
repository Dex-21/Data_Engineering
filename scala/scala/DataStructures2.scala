object DataStructures2 {
  def main(args: Array[String]): Unit = {

    //Scala Collection  - Map
    //Map : Collection of key-value pairs. Maps can either be mutable or immutable.
    //By default, Map is immutable .
    /*
    val fruitBasket = Map("Apricot"-> 20,"Blueberry" -> 250,"Cherry" -> 100,"Donuts" -> 24,"Eclairs" -> 100)
    //Mutable maps

    import scala.collection.mutable
    val mutableMap = mutable.Map("Apricot"-> 20,"Blueberry" -> 250,"Cherry" -> 100,"Donuts" -> 24,"Eclairs" -> 100)

    //Basic operations
    val value = fruitBasket("Donuts")
    println(fruitBasket.contains("Donuts"))
    val mapSize = fruitBasket.size
    println(mapSize)
    val keys = mutableMap.keys
    val values = mutableMap.values

    //Adding and Removing in a Map

    mutableMap += ("Figs" -> 24)
    mutableMap -= ("Eclairs")
    //Apply same on immutable
    val newFruitBasket = fruitBasket + ("Figs" -> 24)
    //Update the value in Key "Figs"
    mutableMap("Figs") = 30

    //Concatenation
    */
    /*
    val set1 = Set(1, 2, 3, 4, 5, 6, 7, 8)
    val set2 = Set("Apple", "Banana", "Cherry", "Oranges", "Watermelon")

    //Basic Operations
    println(set1.contains(5))
    println(set1.size)
    println(set1 + 9)

    //Union of sets
    val set3 = Set("Grapes", "Tomato", "Guava", "Oranges", "Banana")
    val fruitBasket = set2 union set3
    println(fruitBasket)

    //Intersect : Common value between Two sets
    val interSet = set2 intersect set3
    println(interSet)

    //Difference
    val diffSet = set2 diff set3
    println(diffSet)

    //Subset check
    val isSubset = set2.subsetOf(set3)
    println(isSubset)

    //Transformation - map, filter , reduce
    //map
    val Ars = set2.map(_.toLowerCase())
    println(Ars)

    //filter
    val Arf = set2.filter(_.startsWith("A"))
    println(Arf)

    //reduce
    val Arr  = set2.reduce(_+_)
    println(Arr)

    //Mutable Sets
    import scala.collection.mutable
    val mutableSet = mutable.Set(10,20,30,40,50,60,70)
    mutableSet ++= Set(80, 90, 100)
    mutableSet --= Set(10,30)

    println(mutableSet.mkString(" "))

    //Clear the Set
    mutableSet.clear()

    //Create a new collection
    val fruitList = List("Apple", "Apricot", "Chocolate", "Coconut", "Cherry", "Blueberry")
    val mapFruits = fruitList.groupBy(_.head)
    println(mapFruits)

    //Typecast Immutable maps to mutable Map.
    val newMapFruits: mutable.Map[Char,List[String]] = mutable.Map(mapFruits.toSeq:_*)

    //Concatenate new value to mutable map
    newMapFruits ++= Map('D'->List("Donuts"), 'E'->List("Eclairs"))
    println(newMapFruits)

    */
    //Tuple datatype
    //Tuple : Collection of Immutable datatype , Fixed size, Heterogeneous,
    val tuple1 = (1, "Hello World", 3.14, "Scala", 98453737L)
    val firstValue = tuple1._1
    val secondValue = tuple1._2

    //Pattern Matching in Tuple
    val(var1, var2, var3) = (1, "Scala", 3.14)
    println(var1)
    // Returns number of elements present in tuple.
    println(tuple1.productArity)

    //returns datatypes of variable
    println(tuple1.getClass)

    //Copy : Allows to copy tuple with some elements replaced
    val newTuple = tuple1.copy(_4 = "Tuple")

    tuple1.productIterator.foreach{
      (element => println(s"Element : $element"))
    }


  }

}