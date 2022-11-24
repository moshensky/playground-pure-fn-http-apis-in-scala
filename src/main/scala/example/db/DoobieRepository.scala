package example.db

import doobie.util.transactor.Transactor
import cats.effect.kernel.Sync
import example.models.{LanguageCode, ProductId, ProductName}
import example.models

final class DoobieRepository[F[_]: Sync](tx: Transactor[F])
    extends Repository[F] {

  override def loadProduct(id: ProductId): F[Seq[(ProductId, LanguageCode, ProductName)]] = ???

  override def loadProducts(): fs2.Stream[F,(ProductId, LanguageCode, ProductName)] = ???

  override def saveProduct(p: models.Product): F[Int] = ???

  override def updateProduct(p: models.Product): F[Int] = ???

}
