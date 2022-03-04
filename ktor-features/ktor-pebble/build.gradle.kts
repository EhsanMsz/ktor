/*
 * Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

val pebble_version: String by extra

kotlin.sourceSets {
    val jvmMain by getting {
        dependencies {
            api("io.pebbletemplates:pebble:$pebble_version")
        }
    }
}
