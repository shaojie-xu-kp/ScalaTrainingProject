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
    
    val tupleA = (1,3)
    println(tupleA._1 + tupleA._2)
    
    var myArray = new Array[Int](3)
    myArray(0) = 1 
    myArray(1) = 2 
    myArray(2) = 3;
    
    var myList = Array("a", "b", "c")
    
    for( x <- myArray) {
      println(x);
    }
    
     for( x <- myList) {
      println(x);
    }
    
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