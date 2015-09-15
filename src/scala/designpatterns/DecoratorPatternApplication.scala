package designpatterns


trait Shape {
  def draw
}

trait RectangleShap extends Shape {
  override def draw: Unit = println("Drawing Rectangle")
}

