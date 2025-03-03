plugins {
    id("base-feature")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "mymultimoduletemplate.home"
}

dependencies {
    implementation(project(":core:data"))
    coroutines()
    unitTest()
    androidTest()
}
