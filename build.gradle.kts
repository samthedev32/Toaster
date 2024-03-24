plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    implementation("me.jakejmattson:DiscordKt:0.23.4")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}