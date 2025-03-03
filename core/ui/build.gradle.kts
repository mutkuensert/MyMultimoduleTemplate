plugins {
    id("base-feature")
    kotlin("plugin.serialization")
}

android {
    namespace = "mymultimoduletemplate.core.ui"
}

dependencies {
    compose()
    implementation(libraries.kotlinSerialization)
}
