object Hangman extends App{
  import scala.io.Source
  import scala.io.StdIn.readLine
  import scala.util.Random.nextInt

  val wordSource = Source.fromFile("C:/Users/Admin/Documents/Bilals Stuff/Bilal - Scala/enable1.txt").getLines.toList
  println(wordSource.size)
}
