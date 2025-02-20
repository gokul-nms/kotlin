plugins {
    kotlin("jvm") version "2.1.10"  // Match installed version
    application
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("MainKt")  // Set the entry point of your application
}

tasks.test {
    useJUnitPlatform()
}
