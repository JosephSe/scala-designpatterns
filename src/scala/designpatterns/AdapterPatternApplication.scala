package designpatterns

trait Log {
  def warn(mess: String)

  def err(mess: String)
}

trait Level

object WARNING extends Level

object ERROR extends Level

