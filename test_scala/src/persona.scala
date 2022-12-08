import java.util.Scanner
class persona {

  val name = new Scanner(System.in)
  val age = new Scanner(System.in)

  val grettings = "Hola soy %s y tengo %s años".format(name.next(), age.next())

  def gretting(string: String, int: Int): Unit = {
    gretting(name.toString, age.toString.toInt)
  }

}
