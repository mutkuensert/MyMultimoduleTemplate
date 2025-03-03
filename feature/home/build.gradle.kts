plugins {
    id("base-feature")
}

android {
    namespace = "feature.home"
}

dependencies {
    implementation(project(":core:data"))
    coroutines()
    unitTest()
    androidTest()
}
