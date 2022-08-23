lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-cli-sb)",

  // orgnization name (e.g., the package name of the project)
  organization := "com.treasure-data",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Treasure Data Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
  "org.bouncycastle" % "bcpkix-jdk15on" % "1.65",
  "javax.xml.bind" % "jaxb-api" % "2.3.1",
  "org.springframework.boot" % "spring-boot-starter-web" % "2.4.1",
  "org.springframework.security" % "spring-security-crypto" % "5.3.2.RELEASE",
  "commons-codec" % "commons-codec" % "1.15",
  "org.webjars" % "webjars-locator-core" % "0.30",
  "org.webjars" % "bootstrap" % "3.3.7",
  "org.webjars" % "jquery" % "3.1.1-1",
  "org.apache.tomcat.embed" % "tomcat-embed-jasper" % "9.0.46",
"javax.servlet" % "javax.servlet-api" % "4.0.0",
"javax.servlet.jsp" % "javax.servlet.jsp-api" % "2.3.3" % "provided",
  "javax.servlet" % "jstl" % "1.2",
  "org.springframework.boot" % "spring-boot-starter-security" % "2.4.1"
   ),

  mainClass := Some("example.Application")
)
