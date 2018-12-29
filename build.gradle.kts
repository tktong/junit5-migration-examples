plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(Dependencies.JUNIT4)
    testImplementation(Dependencies.JUNIT_API)
    testImplementation(Dependencies.MOCKITO_CORE)
    testImplementation(Dependencies.MOCKITO_JUNIT_JUPITER)

    testRuntime(Dependencies.JUNIT_JUPITER_ENGINE)
    testRuntime(Dependencies.JUNIT_PLATFORM_LAUNCHER)
    testRuntime(Dependencies.JUNIT_VINTAGE_ENGINE)
}

tasks.withType<Test> {
    useJUnitPlatform {
        includeEngines("junit-jupiter","junit-vintage")
    }
    testLogging {
        events("passed","skipped","failed")
    }
}