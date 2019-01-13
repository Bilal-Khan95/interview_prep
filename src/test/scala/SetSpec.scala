import helpers.ClassTest
import scala.io.StdIn.readLine
class SetSpec extends ClassTest{
  "Calculator class " should " return an addition" in {
    val calc = new Calculator
    assert(calc.add(1,1)==2)
  }
}
