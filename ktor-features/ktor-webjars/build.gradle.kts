description = ""

val webjars_version: String by extra
val webjars_jquery_version: String by extra

kotlin {
    sourceSets {
        val jvmMain by getting {
            dependencies {
                api("org.webjars:webjars-locator-core:$webjars_version")
            }
        }
        val jvmTest by getting {
            dependencies {
                api("org.webjars:jquery:$webjars_jquery_version")
            }
        }
    }
}
