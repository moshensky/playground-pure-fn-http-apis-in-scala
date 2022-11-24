package example.models

import io.circe._
import io.circe.generic.semiauto._
import cats.data.NonEmptyList

final case class Product(id: ProductId, names: NonEmptyList[Translation])

object Product {
  implicit val decode: Decoder[Product] = deriveDecoder[Product]
  implicit val encode: Encoder[Product] = deriveEncoder[Product]
}
