val freemarker_version: String by extra

kotlin.sourceSets {
    val jvmMain by getting {
        dependencies {
            api("org.freemarker:freemarker:$freemarker_version")
        }
    }
}
