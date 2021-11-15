plugins {
    id("org.jetbrains.compose") version "1.0.0-beta5"
    id("com.android.application")
    kotlin("android")
}

group = "top.iseason"
version = "1.0"

repositories {
}

dependencies {
    implementation(project(":common"))
    implementation(compose.uiTooling)
    implementation(compose.preview)
}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "top.iseason.android"
        minSdkVersion(24)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
        }
    }
    buildFeatures {
        viewBinding = true
    }
}