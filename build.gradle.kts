plugins {
  application
  jacoco
}

application {
  mainClassName = "Main"
}

repositories {
  jcenter()
}

dependencies {
  testCompile(group = "junit", name = "junit", version = "4.12")
}

tasks.withType<JacocoReport> {
  reports {
    xml.isEnabled = true
    html.isEnabled = false
  }
}

val check by tasks
val jacocoTestReport by tasks
check.dependsOn(jacocoTestReport)
