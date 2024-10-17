import scala.io.Source
object FileAnalysis {
  def main(args: Array[String]): Unit = {
    //Read from file
    val source = Source.fromFile("C:/Users/Administrator/Downloads/sample.txt")

    //Read all values and Create list of lines
    val lines = source.getLines().toList

    //Close the file object
    source.close()

    //Process the file data
    //Split times into words, change words to lower case
    val words = lines.flatMap(_.split("\\s+").map(_.toLowerCase))
    //Group words by identity
    //map values by iy size
    //sorts words in descending order using negated values

    val wordCount = words.groupBy(identity).mapValues(_.size).toSeq.sortBy(-_._2)


    //Print top 10 most frequent words
    wordCount.take(10).foreach {
      case (word, count) =>
        println(s"$word: $count")
    }


    //Find the count of the words

    val totalWordCount = words.length
    println(totalWordCount)


    //Find the word with maximum length and minimum length
   

    val sortedArray = words.sortWith(_.length<_.length)
    println(sortedArray.head)
    println(sortedArray.last)


  }

}