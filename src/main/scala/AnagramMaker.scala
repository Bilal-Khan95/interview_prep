object AnagramMaker extends App {

  import scala.io.StdIn.readLine
  import scala.io.Source

  println("Enter some letters (max 4)")
  var wordInput = readLine.toArray
  val wordSource = Source.fromFile("C:/Users/Admin/Documents/Bilals Stuff/Bilal - Scala/enable1.txt").getLines.toList
  var i = 0
  var k = 0
  var count = 0

  def wordFinder(word:Array[Char]): Unit ={
    while(i < wordSource.length) {
      while (count < word.length) {
        if (wordSource(i).contains(word(k))) {
          k += 1
          count += 1
        } else {
          count += 1
        }
      }
      if (k == word.length) {
        println(wordSource(i))
        i += 1
        k = 0
        count = 0
      } else {
        i += 1
        k = 0
        count = 0
      }
    }
  }
  val result1 = wordFinder(wordInput).filter.contains
}