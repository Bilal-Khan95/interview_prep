object MorseCodeTranslator extends App {
  import scala.io.StdIn.{readLine, readInt}
  var newWord:String = ""

  menu()
  def menu(){
    println("Select function\n1) Morse to English\n2) English to Morse")
    val numSelect = readInt
    numSelect match{
      case 1 => morseTranslator()
      case 2 => engTranslator()
      case _ => menuReload()
    }
  }

  def menuReload(){
    println("\nInvalid selection\nWould you like to try again?\n1) Yes \n2) No")
    val secondSelect = readInt()
    secondSelect match{
      case 1 => menu()
      case _ => println("END")
    }

  }

  def menuReload2ElectricBoogaloo(){
    println("Would you like to go again?\n1) Yes\n2) No")
    val num2 = readInt()
    num2 match{
      case 1 => menu()
      case _ => println("END")
    }
  }

  def morseToEng(letterInput:String):String = {
    letterInput match {
      case ".-" => "a"
      case "-..." => "b"
      case "-.-." => "c"
      case "-.." => "d"
      case "." => "e"
      case "..-." => "f"
      case "--." => "g"
      case "...." => "h"
      case ".." => "i"
      case ".---" => "j"
      case "-.-" => "k"
      case ".-.." => "l"
      case "--" => "m"
      case "-." => "n"
      case "---" => "o"
      case ".--." => "p"
      case "--.-" => "q"
      case ".-." => "r"
      case "..." => "s"
      case "-" => "t"
      case "..-" => "u"
      case "...-" => "v"
      case ".--" => "w"
      case "-..-" => "x"
      case "-.--" => "y"
      case "--.." => "z"
      case "/" => " "
      case ".----" => "1"
      case "..---" => "2"
      case "...--" => "3"
      case "....-" => "4"
      case "....." => "5"
      case "-...." => "6"
      case "--..." => "7"
      case "---.." => "8"
      case "----." => "9"
      case "-----" => "0"
      case _ => ""
    }

  }

  def engToMorse(letterInput:String):String = {
    letterInput match {
      case "a" => ".- "
      case "b" => "-... "
      case "c" => "-.-. "
      case "d" => "-.. "
      case "e" => ". "
      case "f" => "..-. "
      case "g" => "--. "
      case "h" => ".... "
      case "i" => ".. "
      case "j" => ".--- "
      case "k" => "-.- "
      case "l" => ".-.. "
      case "m" => "-- "
      case "n" => "-. "
      case "o" => "--- "
      case "p" => ".--. "
      case "q" => "--.- "
      case "r" => ".-. "
      case "s" => "... "
      case "t" => "- "
      case "u" => ".. "
      case "v" => "...- "
      case "w" => ".-- "
      case "x" => "-..- "
      case "y" => "-.-- "
      case "z" => "--.. "
      case " " => "/"
      case "1" => ".---- "
      case "2" => "..--- "
      case "3" => "...-- "
      case "4" => "....- "
      case "5" => "..... "
      case "6" => "-.... "
      case "7" => "--... "
      case "8" => "---.. "
      case "9" => "----. "
      case "0" => "----- "
      case _ => ""
    }

  }

  def morseTranslator(){
    println("Enter your morse code, separated by '/' ")
    val wordInput = readLine.split("/")
    for(i<- wordInput.indices){
      newWord += morseToEng(wordInput(i))
    }
    println(newWord)
    menuReload2ElectricBoogaloo()
  }

  def engTranslator(){
    println("Enter a some words")
    val wordInput = readLine.toLowerCase()
    for(i<- wordInput.indices){
      newWord += engToMorse(wordInput.substring(i,i+1))
    }
    println(newWord)
    menuReload2ElectricBoogaloo()
  }
}
