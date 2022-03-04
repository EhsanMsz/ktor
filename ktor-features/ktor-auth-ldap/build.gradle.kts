
val apacheds_version: String by extra

kotlin.sourceSets {
    val jvmMain by getting {
        dependencies {
            api(project(":ktor-features:ktor-auth"))
        }
    }
    val jvmTest by getting {
        dependencies {
            api("org.apache.directory.server:apacheds-server-integ:$apacheds_version")
            api("org.apache.directory.server:apacheds-core-integ:$apacheds_version")
        }
    }
}
