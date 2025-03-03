plugins {
    id("base-library")
}

android {
    namespace = "core.data"
}

dependencies {
    coroutines()
    unitTest()
}
