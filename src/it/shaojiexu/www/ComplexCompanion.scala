package it.shaojiexu.www

object ComplexCompanion {
  
     def main(args:Array[String]) {
       
       val complex = new Complex(1.3,4.5)
       println("imaginary part : " + complex.im)
       println(complex.toString())
     }
     
}