package designpatterns

trait Base {
  type Strategy = (Int, Int) => Int

  class Context(computer: Strategy) {
    def use(a: Int, b: Int) = {
      computer(a, b)
    }
  }

  val add: Strategy = _ + _
  val multiply: Strategy = _ * _
}

object StrategyPatternApplication extends App with Base {
  println(new Context(add).use(2, 5))
  println(new Context(multiply).use(3, 5))
}
