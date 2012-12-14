import scala.io.Source

object FinDeMesScala extends App {

 
  var johanna: Double = 0.0
  var dani: Double = 0.0
  for (line <- Source.fromFile("C:\\findemes\\input.txt").getLines()) {

    val pieces = line.split(" ")
    if ("Johanna".equalsIgnoreCase(pieces(0))) {
      johanna = johanna + pieces(1).toDouble
    } else if ("Dani".equalsIgnoreCase(pieces(0))) {
      dani = dani + pieces(1).toDouble 
    }
  }
  println("dani gasto " + dani + " y johanna " + johanna + " por lo que dani le debe a johanna la cantidad de " + (johanna - dani) / 2)
}