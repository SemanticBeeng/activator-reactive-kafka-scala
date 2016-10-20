import scalariform.formatter.preferences._

name := "reactive-kafka-scala"

version := "2.0"

scalaVersion := "2.11.8"

val akkaVersion = "2.4.11"
//val akkaStreamVersion = "2.0"
//val kafkaVersion = "0.9.0.0"

libraryDependencies ++= Seq(
  //"com.softwaremill.reactivekafka" %% "reactive-kafka-core" % "0.9.0",
  "com.softwaremill.reactivekafka" % "reactive-kafka-core_2.11" % "0.10.1",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.slf4j" % "log4j-over-slf4j" % "1.7.12",
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" % "akka-stream_2.11" % akkaVersion,
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
)

scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(PreserveDanglingCloseParenthesis, true)

fork in run := true
