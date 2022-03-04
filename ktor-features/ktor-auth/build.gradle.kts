/*
 * Copyright 2014-2020 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

description = ""

val json_simple_version: String by extra

kotlin {
    sourceSets {
        val jvmMain by getting {
            dependencies {
                api(project(":ktor-client:ktor-client-core"))
                api("com.googlecode.json-simple:json-simple:$json_simple_version") {
                    isTransitive = false
                }
            }
        }
        val jvmTest by getting {
            dependencies {
                api(project(":ktor-client:ktor-client-cio"))
                api(project(":ktor-client:ktor-client-mock"))
                api(project(":ktor-server:ktor-server-test-host"))
            }
        }
    }
}
