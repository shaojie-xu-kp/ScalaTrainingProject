package it.shaojiexu.www.covariance

/**
  * Created by shaojiexu on 6/24/17.
  */
trait Container[+T] {

  def isEmpty : Boolean
  def head : T
  def tail : Container[T]
  def prepend [U >: T] (elem : U) : Container[U] = new Cons(elem, this)
}

class Cons[T](val head : T, val tail : Container[T]) extends Container[T]{
  override def isEmpty = false
}

object Nil extends Container[Nothing] {

  override def isEmpty: Boolean = true

  override def head: Nothing = throw new NoSuchElementException("Nil.head")

  override def tail: Container[Nothing] = throw new NoSuchElementException("Nil.tail")
}


object ContainerTest extends App {

  def nth[T] (n : Int, container: Container[T]) : T = {
    if(container.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) container.head
    else nth(n - 1, container.tail)
  }

  val container = new Cons(1, new Cons(2, new Cons(3,  Nil)))
  println(nth(0, container))
  println(nth(1, container))
  println(nth(2, container))

}