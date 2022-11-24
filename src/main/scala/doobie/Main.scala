package doobie

import cats.effect.IOApp
import cats.effect.{ExitCode, IO}

import doobie._
import doobie.implicits._
import cats._, cats.data._, cats.syntax.all._
// import doobie.util.transactor.Transactor

object Main extends IOApp {

  val program1 = 42.pure[ConnectionIO]

  val xa = Transactor.fromDriverManager[IO](
    "org.postgresql.Driver", // driver classname
    "jdbc:postgresql:world", // connect URL (driver-specific)
    "postgres", // user
    "mysecretpassword"
  )

  override def run(args: List[String]): IO[ExitCode] = {
    for {
      _ <- IO(println("hello"))
      value <- program1.transact(xa)
      _ <- IO(println(value))
    } yield ExitCode.Success
  }

}
