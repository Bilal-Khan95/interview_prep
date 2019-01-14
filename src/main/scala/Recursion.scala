object Recursion {
//  import scala.io.StdIn.readInt
//  println("Enter a number")
//  val userInput = readInt()
//  def addition(numInput:Int): Unit ={
//    var result = numInput
//    result += 1
//  }
def main(args: Array[String]) {
  for (i <- 1 to 10)
    println( "Factorial of " + i + ": = " + factorial(i) )
}

  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }

}