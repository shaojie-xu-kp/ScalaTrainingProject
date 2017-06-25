name := """scala training"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val akkaVersion = "2.5.2"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "junit" % "junit" % "4.12" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

fork in run := true