package example.db

import cats.effect.IO
import example.db.{DatabaseLogin, DatabasePassword, DatabaseUrl}
import org.flywaydb.core.Flyway
import eu.timepit.refined.auto._

final class FlywayDatabaseMigrator extends DatabaseMigrator[IO] {

  override def migrate(
      url: DatabaseUrl,
      user: DatabaseLogin,
      pass: DatabasePassword
  ): IO[Int] = IO {
    val flyway: Flyway = Flyway
      .configure()
      .dataSource(url, user, pass)
      .load()
    flyway.migrate().migrationsExecuted
  }

}
