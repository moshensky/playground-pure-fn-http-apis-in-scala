ThisBuild / scalaVersion := "2.13.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"
name := "Playground: Pure functional HTTP APIs in Scala"

val catsVersion = "2.8.0"
val catsEffectVersion = "3.4.1"
val circeVersion = "0.14.1"
val refinedVersion = "0.10.1"
val doobieVersion = "1.0.0-RC2"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % catsVersion,
  "org.typelevel" %% "cats-effect" % catsEffectVersion,
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "io.circe" %% "circe-refined" % circeVersion,
  "com.github.pureconfig" %% "pureconfig" % "0.17.2",
  "eu.timepit" %% "refined" % refinedVersion,
  "eu.timepit" %% "refined-cats" % refinedVersion,
  "eu.timepit" %% "refined-pureconfig" % refinedVersion,
  "org.flywaydb" % "flyway-core" % "9.8.2",
  "co.fs2" %% "fs2-core" % "3.4.0",
  "org.scalameta" %% "munit" % "0.7.29" % Test,
  "org.typelevel" %% "munit-cats-effect-3" % "1.0.6" % Test,
  "org.tpolecat" %% "doobie-core" % doobieVersion,
  "org.tpolecat" %% "doobie-hikari" % doobieVersion,
  "org.tpolecat" %% "doobie-postgres" % doobieVersion,
  "org.tpolecat" %% "doobie-postgres-circe" % doobieVersion,
  "org.tpolecat" %% "doobie-refined" % doobieVersion,
)


scalacOptions --= Seq("-Xfatal-warnings")
// scalacOptions in (Compile, console) --= Seq("-Ywarn-unused:imports", "-Xfatal-warnings")

