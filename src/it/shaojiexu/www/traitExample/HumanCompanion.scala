package it.shaojiexu.www.traitExample

import it.shaojiexu.www.Complex

/**
  * Created by shaojiexu on 6/4/17.
  */
object HumanCompanion {

  def main(args:Array[String]) {

    var shaojie = new Human("shaojie")
//    shaojie.listen

    seekHelp(shaojie)

    var rover = new Dog("rover")
    rover.listen
    seekHelp(rover)

    var dog = new Dog(name = "sdasf")
    println("the name is : " + dog)

    var snow = new Cat("snow") with Friend
    snow.listen

  }

  def seekHelp(friend: Friend) = friend.listen
}


trait Friend {

  val name : String
  def listen = println("I am " + name + " your friend")

}
