ThisBuild / organization := "io.github.liewhite"
// ThisBuild / name := "common"
ThisBuild / organizationName := "liewhite"
ThisBuild / version := sys.env.get("RELEASE_VERSION").getOrElse("0.4.2")
ThisBuild / scalaVersion := "3.2.0"
ThisBuild / versionScheme := Some("early-semver")
ThisBuild / sonatypeCredentialHost := "s01.oss.sonatype.org"
ThisBuild / publishTo := sonatypePublishToBundle.value
sonatypeCredentialHost := "s01.oss.sonatype.org"
ThisBuild / sonatypeRepository := "https://s01.oss.sonatype.org/service/local"

lazy val root = project
  .in(file("."))
  .settings(
    name := "common",
    // version := "0.1.0-SNAPSHOT",

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
