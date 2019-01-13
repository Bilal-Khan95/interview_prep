object Palindrome extends App{
  import scala.io.StdIn.readLine

  println("enter a sequence of charcters")
  val wordInput = readLine()
  stringReverser(wordInput)

  def stringReverser(a:String):String={
    var reverseWord = ""
    for(i <- a.length-1 to 0 by -1){
      reverseWord += a.substring(i,i+1)
    }
    reverseWord
  }
  if(stringReverser(wordInput) == wordInput){
    println("Sequence is palindromic")
  }else{
    println("Sequence is not palindromic")
  }
}

