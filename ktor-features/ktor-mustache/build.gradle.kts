
val mustache_version: String by extra

kotlin.sourceSets {
    val jvmMain by getting {
        dependencies {
            api("com.github.spullara.mustache.java:compiler:$mustache_version")
        }
    }
}
