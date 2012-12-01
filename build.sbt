resolvers += "twitter-repo" at "http://maven.twttr.com"

libraryDependencies ++= Seq(
  "com.twitter" % "finagle-core_2.9.1" % "4.0.2",
  "com.twitter" % "finagle-http_2.9.1" % "4.0.2",
  "com.twitter" % "finagle-stream_2.9.1" % "4.0.2"
)

