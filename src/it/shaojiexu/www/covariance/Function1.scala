package it.shaojiexu.www.covariance

/**
  * Created by shaojiexu on 6/25/17.
  */
trait Function1 {

  def f1(d : Dog) : Animal
  def f2(a : Animal) : Dog

}

class Function1Impl extends Function1{

  override def f1(d: Dog): Animal = ???

  override def f2(a: Animal): Dog = ???

}

object Function1 extends App{

  val function1Impl = new Function1Impl()

  def apply1(f: Dog => Animal, d : Dog) = f(d)
  def apply2(f: Animal => Dog, a : Animal) = f(a)

  val dog = new Dog("dog")
  val animal = new Cat("cat")

  apply1(function1Impl.f1, dog)
  apply1(function1Impl.f2, dog)
//  apply2(function1Impl.f1, animal)
  apply2(function1Impl.f2, animal)

}
