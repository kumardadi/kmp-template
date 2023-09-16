plugins {
    kotlin("multiplatform")
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.compose)
}

kotlin {
    androidTarget()
    jvmToolchain(17)
    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = libs.versions.namespace.get()
        minSdk = 30
        versionCode = 1
        versionName = "1.0"
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    }
    namespace = "${libs.versions.namespace.get()}.android"
}


compose {
    kotlinCompilerPlugin.set(libs.versions.compose.wasm.version.get())
}
