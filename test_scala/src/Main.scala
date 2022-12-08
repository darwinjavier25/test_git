object Main {
  def main(args: Array[String]): Unit = {
    val mensaje = new Saludar
    val name = mensaje.name
    println(name)

    val pers = Persona.name
    println(pers)
  }
}