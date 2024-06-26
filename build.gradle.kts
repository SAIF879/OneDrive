buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
//    id("com.google.dagger.hilt.android") version "2.48" apply false
//    alias(libs.plugins.androidApplication) apply false
//    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    // alias(libs.plugins.hiltAndroid)  apply false
    id("com.android.application") version "8.3.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.dagger.hilt.android") version "2.48.1" apply false
}