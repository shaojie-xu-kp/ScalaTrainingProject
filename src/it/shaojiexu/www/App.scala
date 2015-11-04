package it.shaojiexu.www

import java.text.DateFormat.LONG
import java.text.DateFormat.getDateInstance
import java.util.Date
import java.util.Locale

object App {
  
  def main(args:Array[String]) {
    println("hello world!");
    italianDateFormate
    
    var complex = new Complex(1.1,2.2);
    println(complex.toString())
    println(addInt(1,2))
  }
  
  def italianDateFormate() : Unit ={
     var now = new Date
     val df = getDateInstance(LONG,Locale.ITALIAN)
     println(df format now)
  }
  
  def addInt(a: Int, b: Int ) : Int = {
    return a + b;
  }
  
}