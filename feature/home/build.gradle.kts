plugins {
    id("base-feature")
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
