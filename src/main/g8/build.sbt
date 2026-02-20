val scala3Version = "3.8.1"

fork := true

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    organization := "$package$",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0" % Test,
      "ch.contrafactus" %% "dimwit-core" % "0.1.0-SNAPSHOT" changing (),
    )

  )
