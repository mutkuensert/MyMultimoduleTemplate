plugins {
    id("base-library")
}

android {
    namespace = "mymultimoduletemplate.core.data"
}

dependencies {
    coroutines()
    unitTest()
}
