package hello.world

object Aplicacao {
  def iniciar() {
    println("=================================")
    println("Iniciando aplicação...")
    println("=================================")

    println("=================================")
    println("FATORIAL: ")
    apresentarFatorial()
    println("=================================")
  }

  def apresentarFatorial() {
    var f5 = Calculadora.fatorial(5)
    var f10 = Calculadora.fatorial(10)
    var f50 = Calculadora.fatorial(50)

    println("10! => " + f5)
    println("10! => " + f10)
    println("50! => " + f50)
  }
}