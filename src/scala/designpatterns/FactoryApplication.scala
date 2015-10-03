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

