description = ""

val dropwizard_version: String by extra

kotlin {
    sourceSets {
        val jvmMain by getting {
            dependencies {
                api("io.dropwizard.metrics:metrics-core:$dropwizard_version")
                api("io.dropwizard.metrics:metrics-jvm:$dropwizard_version")
            }
        }
    }
}
