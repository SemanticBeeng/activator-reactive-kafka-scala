import scalariform.formatter.preferences._

name := "reactive-kafka-scala"

version := "2.0"

scalaVersion := "2.11.8"

val akkaVersion = "2.4.11"

libraryDependencies ++= Seq(

  "org.apache.kafka" % "kafka_2.11" % "0.10.0.1",
  "com.softwaremill.reactivekafka" % "reactive-kafka-core_2.11" % "0.10.1",

  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" % "akka-stream_2.11" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",

  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.slf4j" % "log4j-over-slf4j" % "1.7.12",

  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)
  .setPreference(DoubleIndentClassDeclaration, true)
  .setPreference(PreserveDanglingCloseParenthesis, true)

fork in run := true
