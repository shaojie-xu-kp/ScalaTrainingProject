package it.shaojiexu.www.traitExample

/**
  * Created by shaojiexu on 6/4/17.
  */
class Animal (val name : String) {

}

class Dog (override val name : String = "dog") extends Animal(name) with Friend {

  override def toString: String = s"name : $name"
}

class Cat (override val name : String) extends Animal(name) {

}

