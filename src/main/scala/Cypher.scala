object Cypher extends App{
  import scala.io.StdIn.readLine

  println("Enter a word")
  val wordInput = readLine.toLowerCase
  var newWord:String = ""
  atBashEncoder(wordInput)

  def wordMatcher(letterInput:String):String = {
    letterInput match {
      case "a" => "z"
      case "b" => "y"
      case "c" => "x"
      case "d" => "w"
      case "e" => "v"
      case "f" => "u"
      case "g" => "t"
      case "h" => "s"
      case "i" => "r"
      case "j" => "q"
      case "k" => "p"
      case "l" => "o"
      case "m" => "n"
      case "n" => "m"
      case "o" => "l"
      case "p" => "k"
      case "q" => "j"
      case "r" => "i"
      case "s" => "h"
      case "t" => "g"
      case "u" => "f"
      case "v" => "e"
      case "w" => "d"
      case "x" => "c"
      case "y" => "b"
      case "z" => "a"
      case " " => " "
      case _ => letterInput
    }
  }

  def atBashEncoder(word:String){
    for(i<- 0 until word.length){
      newWord += wordMatcher(word.substring(i,i+1))
    }
    println(newWord)
  }
}