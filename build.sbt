sbtPlugin := true

organization := "tv.cntt"
name         := "xitrum-package"

version := "1.9.1-SNAPSHOT"

// Kenji Yoshida (https://github.com/xuwei-k):
// scalaVersion should not be specified for SBT plugin; use default scalaVersion
//scalaVersion := "2.12.6"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

// http://www.scala-sbt.org/release/docs/Detailed-Topics/Java-Sources
// Avoid problem when this plugin is built with Java 7 but the projects that use it
// are run with Java 6
// java.lang.UnsupportedClassVersionError: Unsupported major.minor version 51.0
javacOptions ++= Seq("-source", "1.6", "-target", "1.6")
