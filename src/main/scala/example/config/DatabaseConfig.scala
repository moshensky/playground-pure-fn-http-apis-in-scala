package example.config

import eu.timepit.refined.auto._
import eu.timepit.refined.pureconfig._
import pureconfig._
import pureconfig.generic.semiauto._

import example.db._

final case class DatabaseConfig(
    driver: NonEmptyString,
    url: DatabaseUrl,
    user: DatabaseLogin,
    pass: DatabasePassword
)

object DatabaseConfig {
  implicit val configReader: ConfigReader[DatabaseConfig] =
    deriveReader[DatabaseConfig]
}
