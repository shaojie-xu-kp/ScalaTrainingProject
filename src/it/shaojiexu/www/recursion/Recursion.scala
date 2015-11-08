package it.shaojiexu.www.recursion

object Recursion {

  //tail recursion
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  
  //non tail recursion, stack problem
  def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)
  
  //tail recursion version of factorial, stack safe
  def tailRecursiveFactorial(n: Int, m: Int) : Int = {
    if(n == 1) m
    else tailRecursiveFactorial(n-1, m*n);
  }
  
   def main(args:Array[String]) {
     println(gcd(4,10))
     println(factorial(5))
     println(tailRecursiveFactorial(5,1))
  }

}