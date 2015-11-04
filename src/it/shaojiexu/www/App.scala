package it.shaojiexu.www

import java.util.{Date,Locale}
import java.text.DateFormat._

object App {
  
  def main(args:Array[String]) {
    println("hello world!");
    italianDateFormate
  }
  
  def italianDateFormate(){
     var now = new Date
     val df = getDateInstance(LONG,Locale.ITALIAN)
     println(df format now)
  }
  
}