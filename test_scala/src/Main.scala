object Main {
  def main(args: Array[String]): Unit = {
    println("Introduce tu nombre y tu edad!")

    val saludo = new persona
    println(saludo.grettings)

    println("nuevo cambio en main")
  }
}