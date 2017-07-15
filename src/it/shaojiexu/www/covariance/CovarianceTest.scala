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
  val animals : List[Animal] = cats:::dogs

  printAnimalNames(animals)


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

trait Animal {
  def name: String
}
case class Cat(val name: String) extends Animal
case class Dog(val name: String) extends Animal


trait AnimalFunction {

  def f1(d : Dog) : Animal
  def f2(a : Animal) : Dog

}

