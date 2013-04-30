package hello.world

object Calculadora {
	def fatorial(n: BigInt): BigInt =
	  if (n == 0) 1 else n * fatorial(n-1)
	
}