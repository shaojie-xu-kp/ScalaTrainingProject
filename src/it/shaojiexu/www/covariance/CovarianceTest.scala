package it.shaojiexu.www.covariance

/**
  * Created by shaojiexu on 6/7/17.
  */
object CovarianceTest extends App {

  def printAnimalNames(animals: List[Animal]): Unit = {
    animals.foreach(animal => println(animal.name))
  }

  val cats: List[Cat] = List(Cat("Whiskers"), Cat("Tom"))
  val dogs: List[Dog] = List(Dog("Fido"), Dog("Rex"))

  printAnimalNames(cats)
  printAnimalNames(dogs)
}

abstract class Animal {
  def name: String
}
case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal
