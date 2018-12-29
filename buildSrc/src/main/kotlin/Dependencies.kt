object Versions {
    val JUNIT4 = "4.12"
    val JUNIT_JUPITER_ENGINE = "5.3.2"
    val JUNIT_PLATFORM_LAUNCHER = "1.3.2"
    val JUNIT_VINTAGE_ENGINE = "5.3.2"
    val MOCKITO_CORE = "2.23.4"
    val MOCKITO_JUNIT_JUPITER = "2.23.4"
}

object Dependencies {
    val JUNIT4 = "junit:junit:${Versions.JUNIT4}"
    val JUNIT_API = "org.junit.jupiter:junit-jupiter-api:${Versions.JUNIT_JUPITER_ENGINE}"
    val JUNIT_JUPITER_ENGINE = "org.junit.jupiter:junit-jupiter-engine:${Versions.JUNIT_JUPITER_ENGINE}"
    val JUNIT_PLATFORM_LAUNCHER = "org.junit.platform:junit-platform-launcher:${Versions.JUNIT_PLATFORM_LAUNCHER}"
    val JUNIT_VINTAGE_ENGINE = "org.junit.vintage:junit-vintage-engine:${Versions.JUNIT_VINTAGE_ENGINE}"
    val MOCKITO_CORE = "org.mockito:mockito-core:${Versions.MOCKITO_CORE}"
    val MOCKITO_JUNIT_JUPITER = "org.mockito:mockito-junit-jupiter:${Versions.MOCKITO_JUNIT_JUPITER}"
}