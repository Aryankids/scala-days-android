addSbtPlugin("org.brianmckenna" % "sbt-wartremover" % "0.13")

addSbtPlugin("com.hanhuy.sbt" % "android-sdk-plugin" % "1.5.19")

resolvers += "Fabric public" at "https://maven.fabric.io/public"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-s3" % "1.10.44",
  "org.apache.httpcomponents" % "httpclient" % "4.5.1",
  "org.apache.httpcomponents" % "httpmime" % "4.5.1",
  "io.fabric.tools" % "gradle" % "1.21.4"
)
