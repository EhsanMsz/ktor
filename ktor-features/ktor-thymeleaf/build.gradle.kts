
val thymeleaf_version: String by extra

kotlin.sourceSets {
    val jvmMain by getting {
        dependencies {
            api("org.thymeleaf:thymeleaf:$thymeleaf_version")
        }
    }
}
