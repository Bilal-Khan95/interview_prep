object Factorial extends App{
  import scala.io.StdIn.readInt

  println("Enter a number:")
  val numInput = readInt()
  factorialFinder(numInput)

  def factorialFinder(inputNum:Int){
    var multiplier = 1
    var result = 1
    while(result < inputNum){
      multiplier += 1
      result = result*multiplier
    }
    if(result == inputNum){
      println(s"$inputNum is a factorial of $multiplier")
    }else{
      println(s"$inputNum is not a factorial of anything")
    }
  }

}
