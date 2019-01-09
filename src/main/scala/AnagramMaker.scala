

object AnagramMaker extends App {
  import scala.io.StdIn.{readLine, readInt}
  import scala.io.Source
//
//  println("Enter a number")
//  var numInput = readInt
  println("Enter 4 letters")
  var wordInput = readLine.toArray
  val wordSource = Source.fromFile("C:/Users/Admin/Documents/Bilals Stuff/Bilal - Scala/enable1.txt").getLines.toList

  for(i <- wordSource.indices){
    if(wordSource(i).contains(wordInput)){
      val test = wordSource(i)
      print(test)
    }
  }

//  val listOfWords = List("apple", "helloeeeeeeeeeeeeeeeee", "aaaaaaaalep", "appleee")
//  val keyboardKeys = "alep".toArray
//  var longestWord = ""
//  checkWord()
//  def checkWord():Unit = {
//    for (word <- wordSource) {
//      var containsLetters = ArrayBuffer[Boolean]()
//      for (letter <- wordInput) {
//        if (word.contains(letter)) containsLetters.append(true)
//        else containsLetters.append(false)
//      }
//      if (containsLetters.exists(value => value) && longestWord.length < word.length) {
//        longestWord = word
//      }
//    }
//    println(longestWord)
//  }
//  def wordFinder(word:Array[Char]){
//
//    var i = 0
//    var k = 0
//    var count = 0
//    while(i < wordSource.length) {
//      while (count < word.length) {
//        if (wordSource(i).contains(word(k))) {
//          k += 1
//          count += 1
//        } else {
//          count += 1
//        }
//      }
//      if (k == word.length) {
//        println(wordSource(i))
//        i += 1
//        k = 0
//        count = 0
//      } else {
//        i += 1
//        k = 0
//        count = 0
//      }
//    }
//  }

//  var b = 0
//  while(b < numInput){
//    wordFinder(wordInput)
//    b +=1
//  }
//  var test: String = ""


}