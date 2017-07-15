package it.shaojiexu.www.covariance

/**
  * Created by shaojiexu on 6/25/17.
  */
trait AnimalFunction {

  def f1(d : Dog) : Animal
  def f2(a : Animal) : Dog

}


object AnimalFunction extends App{

  val animalFunction = new AnimalFunction() {

    override def f1(d: Dog): Animal = new Animal {
      override def name: String = "animal"
    }

    override def f2(a: Animal): Dog =  Dog("tom")
  }

  def apply1(f: Dog => Animal, d : Dog) = f(d)
  def apply2(f: Animal => Dog, a : Animal) = f(a)

  val dog = new Dog("dog")
  val animal = new Cat("cat")


  apply1(animalFunction.f1, dog)
  apply1(animalFunction.f2, dog)
//  apply2(function1Impl.f1, animal)
  apply2(animalFunction.f2, animal)

}
