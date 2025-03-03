plugins {
    id("base-feature")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "mymultimoduletemplate.home"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:ui"))
    coroutines()
    unitTest()
    androidTest()
}
