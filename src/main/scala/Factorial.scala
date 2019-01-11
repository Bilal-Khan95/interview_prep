object Factorial extends App{
  import scala.io.StdIn.readInt

  println("Enter a number:")
  val numInput = readInt()
  factorialFinder(numInput)
  def factorialFinder(a:Int){
    var x = 1
    var y = 1
    while(y<a){
      x = x + 1
      y = y*x
    }
    if(y == a){
      println(s"$a is a factorial of $x")
    }else{
      println(s"$a is not a factorial of anything")
    }
  }

}
