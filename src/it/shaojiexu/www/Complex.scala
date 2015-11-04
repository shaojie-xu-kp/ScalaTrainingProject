package it.shaojiexu.www

class Complex(real:Double, imaginary:Double) {
  
  //two methods without empty parenthesis
  
  def re = real
  def im = imaginary
  
  private var a = real;
  
  private val b = imaginary;
  
  override def toString() = String.format("[ real : %s, imaginary : %s]", String.valueOf(real), String.valueOf(im))
  
}