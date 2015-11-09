package it.shaojiexu.www.function

object SumFunction {
  
  type int = scala.Int

  def id(x: int): int = x

  def square(x: Int): Int = x * x

  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

  /**
   * following tree implementations are in traditional imperative programming style
   *
   * def sumInts(a: Int, b: Int) : Int = if (a > b) 0 else a + sumInts(a+1,b)
   *
   * def sumSquares(a:Int, b:Int) : Int = if (a > b) 0 else square(a) + sumSquares(a + 1, b)
   *
   * def sumPowerOfTwo(a:Int, b:Int) : Int = if (a > b) 0 else powerOfTwo(a) + sumPowerOfTwo(a + 1, b)
   */

  /**
   * bellow we use functional programming style to implement
   * sum function below takes another function as a parameter, it is a high-order function
   */
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)
    
  def curryingSum(f: Int => Int)(a: Int, b:Int) : Int = if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int = 
    //sum(id, a, b)
    curryingSum(x => x)(a, b) // anonymous function , what a "syntactic sugar"
  def sumSquares(a: Int, b: Int): Int = 
    //sum(square, a, b)
    sum((x: Int) => x * x, a, b) // anonymous function 
  def sumPowerOfTwo(a: Int, b: Int): Int = 
    //sum(powerOfTwo, a, b)
    sum((x: Int) => {if (x == 0) 1 else 2 * powerOfTwo(x - 1)}, a, b) // anonymous function 
    
  def main(args: Array[String]) {
      
    println(curryingSum(x => x)(1,5))
    println(sumSquares(1,3))
    println(sumPowerOfTwo(1,3))
    
  }

}