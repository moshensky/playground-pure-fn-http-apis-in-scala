package example.db

trait DatabaseMigrator[F[_]] {
  /**
    * Apple pending migrations to the database
    *
    * @param url
    * @param user
    * @param pass
    * @return The number of applied migrations.
    */
  def migrate(url: DatabaseUrl, user: DatabaseLogin, pass: DatabasePassword): F[Int]
}
