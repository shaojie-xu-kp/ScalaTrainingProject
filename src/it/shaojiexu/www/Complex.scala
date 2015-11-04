package it.shaojiexu.www

class Complex(real:Double, imaginary:Double) {
  
  //two methods without empty parenthesis
  
  def re = real
  def im = imaginary
  
  override def toString() = String.format("[ real : %s, imaginary : %s]", String.valueOf(real), String.valueOf(im))
  
}