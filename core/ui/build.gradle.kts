plugins {
    id("base-feature")
    kotlin("plugin.serialization")
}

android {
    namespace = "mymultimoduletemplate.core.ui"
}

dependencies {
    implementation(libraries.kotlinSerialization)
}
