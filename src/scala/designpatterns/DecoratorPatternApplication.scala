package designpatterns


trait Shape {
  def draw
}

trait RectangleShap extends Shape {
  override def draw: Unit = println("Drawing Rectangle")
}

trait SquareShape extends Shape {
  override def draw: Unit = println("Drawing Square")
}

class Image(width: Int, hight: Int)

object DecoratorPatternApplication extends App {

  new Image(10, 20) with RectangleShap draw

}
