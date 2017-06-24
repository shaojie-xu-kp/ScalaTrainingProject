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

    val car = new Car(100,1)
    car turn "left"

    var numbers = List(1,2,3,4,5,6)
    println(total(numbers))
    println(totalFuntional((numbers)))
    // sum up all the numbers
    println(totalSelectedValues(numbers, { e => true}))
    // sum up all the even numbers
    println(totalSelectedValues(numbers, { e => e % 2 == 0}))
    // sum up all the odd number
    println(totalSelectedValues(numbers, { e => !(e % 2 == 0)}))
    println(totalSelectedValues(numbers, {_ % 2 != 0}))

    // sum up any number bigger than 4
    println(totalSelectedValues(numbers, { _ > 4}))

  }
  
  def italianDateFormate() : Unit ={
     var now = new Date
     val df = getDateInstance(LONG,Locale.ITALIAN)
     println(df format now)
  }
  
  def addInt(a: Int, b: Int ) : Int = {
    return a + b;
  }

  def total( numbers: List[Int])  = {
    var sum = 0
    numbers.foreach{number => sum += number}
    sum
  }

  def totalFuntional( numbers: List[Int])  = {
    numbers.foldLeft(0){
      (carryOver, element) => carryOver + element
    }
  }

  def totalSelectedValues(numbers : List[Int], selector : Int => Boolean) : Int = {
    var sum = 0;
    numbers.foreach( element => {
      if(selector(element)) sum += element
    })
    sum
  }


}