import java.util.Scanner
object Persona {

  val edad = new Scanner(System.in)
  val name = "Hola soy %s".format(edad.next())
  def edad(scanner: Scanner): Unit = {
    this.edad(edad)
  }

}
