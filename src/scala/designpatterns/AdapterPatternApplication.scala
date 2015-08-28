package designpatterns

trait Log {
  def warn(mess: String)

  def err(mess: String)
}

trait Level

object WARNING extends Level

object ERROR extends Level

class Logger {
  def log(level: Level, mess: String): Unit = print(s"$level-$mess")
}

class LoggerToAdapter(logger: Logger) extends Log {

  override def warn(mess: String): Unit = logger.log(WARNING, mess)

  override def err(mess: String): Unit = logger.log(ERROR, mess)
}

object AdapterPatternApplication extends App {

  new LoggerToAdapter(new Logger).warn("this is your warning")

}
