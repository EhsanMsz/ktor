/*
 * Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

val velocity_version: String by extra
val velocity_tools_version: String by extra

kotlin {
    sourceSets {
        val jvmMain by getting {
            dependencies {
                api("org.apache.velocity:velocity-engine-core:$velocity_version")
                api("org.apache.velocity.tools:velocity-tools-generic:$velocity_tools_version")
            }
        }
    }
}
