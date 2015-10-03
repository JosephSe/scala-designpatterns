package designpatterns

trait Animal {
  def makeSound
}

class Dog extends Animal {
  override def makeSound: Unit = println("Woof Woof")
}

class Cat extends Animal {
  override def makeSound: Unit = println("Meow Meow")
}

object Animal {
  def apply(typ: String): Animal = typ match {
    case "dog" => new Dog()
    case "cat" => new Cat()
  }
}

object FactoryApplication extends App {
  Animal("dog").makeSound
}
