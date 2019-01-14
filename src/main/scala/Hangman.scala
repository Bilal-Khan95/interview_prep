object Hangman extends App{
  import scala.io.Source
  import scala.io.StdIn.{readLine,readInt}
  import scala.util.Random.nextInt


  val wordSource = Source.fromFile("C:/Users/Admin/Documents/Bilals Stuff/Bilal - Scala/enable1.txt").getLines.toArray
  val word = wordGenerator()
  var underscoredWord = wordToUnderscore(word)
  startMenu()
  def startMenu(): Unit = {
    println("Welcome to Hangman\nPress 1 to start game")
    val gameInput = readInt()
    if (gameInput == 1) {
      letterMatcher()
    }
  }
  def wordGenerator():String={
    val wordNum = nextInt(1000)
    wordSource(wordNum)
  }

  def wordToUnderscore(word:String):String = {
    var underscoreWord = ""
    for (i <- word.indices) {
      underscoreWord += "_ "
    }
    underscoreWord
  }

  def letterMatcher(): Unit ={
      for(i<-word.indices) {
        println(underscoredWord)
        if (guessChecker()) {
          print("You win")
        } else {
          println("Enter your letter")
          val playerGuess = readLine()
          if (playerGuess == word.substring(i,i+1)) {
            println("Correct")
            println(underscoredWord.replace(underscoredWord.substring(i,i+1) , playerGuess))
          } else {
            println("Incorrect")
          }
        }
      }
  }


  def guessChecker():Boolean={
    val wordToGuess = underscoredWord
    word == wordToGuess
  }

//  def wrongLetter(): Unit ={
//    val guessCounter = word.length -2
//    guessCounter match{
//      case 3 => println("Careful, only 3 guesses left")
//      case 1 => println("WARNING, only 1 guess left")
//      case 0 => println("Game Over")
//    }
//  }
}
