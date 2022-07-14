name := "scalaMusic"

version := "0.1"

scalaVersion := "2.13.2"

libraryDependencies ++= Seq(
  "default" %% "musicdsl" % "1.1",
  "com.googlecode.scala-midi" %% "scala-midi" % "0.2"
)