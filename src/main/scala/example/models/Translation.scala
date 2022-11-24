package example.models

import eu.timepit.refined.auto._
import io.circe.refined._
import io.circe._
import io.circe.generic.semiauto._

final case class Translation(lang: LanguageCode, name: ProductName)

object Translation {
  implicit val decode: Decoder[Translation] = deriveDecoder[Translation]
  implicit val encode: Encoder[Translation] = deriveEncoder[Translation]
}
