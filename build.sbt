import NativePackagerKeys._

packageArchetype.java_server

name := "play-rpm"

version := "1.0.SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

packageSummary in Linux := "The name you want displayed in package summaries - ignored by Rpm"

rpmVendor in Rpm := "Vendor"

packageSummary in Rpm := "Summary"

packageDescription in Rpm := "Package description."

rpmLicense in  Rpm := Some("LICENSE")

rpmUrl in Rpm := Some("http://github.com/example/repo")


exportJars := true

