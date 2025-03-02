import org.gradle.api.Project

fun Project.compose() {
    implementation(dependencies.platform(androidxComposeBom))
    implementation(androidxActivityCompose)
    implementation(androidxComposeRuntime)
    implementation(androidxNavigationCompose)
    implementation(androidxComposeUi)
    implementation(androidxComposeUiToolingPreview)
    implementation(androidxComposeMaterial3)
    debugImplementation(androidXComposeUiTooling)
    implementation(androidxLifecycleRuntimeCompose)
    implementation(androidxLifecycleViewModelCompose)
    androidTestImplementation(androidxComposeUiTestJunit4)
    debugImplementation(androidxComposeUiTestManifest)
}

fun Project.baseAndroid() {
    implementation(koinAndroid)
    implementation(koinCompose)
    implementation(androidxCoreKtx)
    implementation(androidxLifecycleRuntimeKtx)
}

fun Project.base() {
    implementation(koinAndroid)
    testImplementation(koinTest)
    implementation(timber)
}

fun Project.androidTest() {
    androidTestImplementation(androidxTestExtJunit)
    androidTestImplementation(androidxTestRunner)
    androidTestImplementation(androidxTestCore)
}

fun Project.unitTest() {
    testImplementation(junit)
}

fun Project.coroutines() {
    implementation(kotlinxCoroutinesAndroid)
    testImplementation(kotlinxCoroutinesTest)
}