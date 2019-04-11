plugins {
    groovy
    id("com.github.ben-manes.versions") version "0.21.0"
}

description = "Spock Framework - Example Project"

java {
    sourceCompatibility = JavaVersion.VERSION_12
    targetCompatibility = JavaVersion.VERSION_12
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.4.15")

    testImplementation("org.spockframework:spock-core:1.3-RC1-groovy-2.5")

    testCompile("org.hamcrest:hamcrest-core:2.1")

    testRuntime("net.bytebuddy:byte-buddy:1.9.12")  // мокирует классы (в дополнение к интерфейсам)
    testRuntime("org.objenesis:objenesis:3.0.1")    // мокирует классы без конструктора по умолчанию
    testRuntime("com.h2database:h2:1.4.199")
}



