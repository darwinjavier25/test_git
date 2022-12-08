object Main {
  def main(args: Array[String]): Unit = {
    println("Introduce tu nombre y tu edad!")

    val saludo = new persona
    println(saludo.grettings)

    //Esta linea esta demás 
    println("nuevo cambio en main")
  }
}