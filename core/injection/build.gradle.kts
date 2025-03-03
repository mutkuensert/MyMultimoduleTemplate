plugins {
    id("base-library")
}

android {
    namespace = "core.injection"
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":feature:home"))
    unitTest()
}
