package example

import cats.effect.IOApp
import cats.effect.{ExitCode, IO}
import com.typesafe.config.ConfigFactory
import example.config.DatabaseConfig
import pureconfig._
import pureconfig.generic.auto._

object Main extends IOApp {

  override def run(args: List[String]): IO[ExitCode] = {
    for {
      (dbConfig) <- IO {
        val conf = ConfigFactory.load(getClass().getClassLoader())
        val dbConfig = ConfigSource.fromConfig(conf).at("database").loadOrThrow[DatabaseConfig]
        (dbConfig)
      }
      xxx = { 
        val stringBuilder = new StringBuilder().append("message")
        stringBuilder.append(("param0", " ,"))
        stringBuilder.append(("param1", " ,"))
        stringBuilder.toString
      } 
      _ <- IO.println(xxx)
      _ <-IO.println("Hello, World!")
      _ <-IO.println(("Hello", "World!"))
      _ <-IO.println(dbConfig)
    } yield  ExitCode.Success
  }
}
