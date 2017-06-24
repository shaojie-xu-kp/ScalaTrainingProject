package it.shaojiexu.www

/**
  * Created by shaojiexu on 6/5/17.
  */
class Point {

  private var _x = 0
  private var _y = 0
  private val bound = 100
  def x = _x
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning
  }
  def y = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }
  private def printWarning = println("WARNING: Out of bounds")

  override def toString: String =  _x + " : "+ _y


}

object PointCompanion {

  def main(args: Array[String]): Unit = {
    val point1 = new Point
    point1.x = 99
    point1.y = 98
    println(point1)
  }

}