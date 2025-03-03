plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    compileSdk = ProjectConfigs.compileSdk

    defaultConfig {
        minSdk = ProjectConfigs.minSdk

        testInstrumentationRunner = ProjectConfigs.testInstrumentationRunner
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
        aidl = false
        buildConfig = true
        renderScript = false
        shaders = false
    }

    compileOptions {
        sourceCompatibility = ProjectConfigs.sourceCompatibility
        targetCompatibility = ProjectConfigs.targetCompatibility
    }

    kotlinOptions {
        jvmTarget = ProjectConfigs.jvmTarget
    }
}

dependencies {
    base()
    baseAndroid()
    coroutines()
    compose()
}