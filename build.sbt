import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "specs2-stackoverflow",
    libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.3.4")
  )
