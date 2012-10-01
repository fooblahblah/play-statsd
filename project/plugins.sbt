resolvers ++= Seq(
  "livingsocial" at "http://artifacts.livingsocial.net/artifactory/repo",
  Resolver.url("livingsocial-ivy", url("http://artifacts.livingsocial.net/artifactory/repo"))(Resolver.ivyStylePatterns),
  "gseitz@github" at "http://gseitz.github.com/maven/"
)

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.4")

//addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")

addSbtPlugin("play" % "sbt-plugin" % "2.0.4.1")
