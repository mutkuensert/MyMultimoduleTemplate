import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider

object PluginConfigs {
    const val applicationId = "com.mutkuensert.mymultimoduletemplate"
    const val compileSdk = 35
    const val minSdk = 24
    const val targetSdk = 35
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    val sourceCompatibility = JavaVersion.VERSION_17
    val targetCompatibility = JavaVersion.VERSION_17
    const val jvmTarget = "17"
}

val Project.androidxActivityCompose: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.activity.compose")
val Project.androidxComposeBom: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.compose.bom")
val Project.androidxComposeMaterial3: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.compose.material3")
val Project.androidxComposeUi: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.compose.ui")
val Project.androidxComposeUiTestJunit4: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.compose.ui.test.junit4")
val Project.androidxComposeUiTestManifest: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.compose.ui.test.manifest")
val Project.androidXComposeUiTooling: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.compose.ui.tooling")
val Project.androidxComposeUiToolingPreview: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.compose.ui.tooling.preview")
val Project.androidxCoreKtx: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.core.ktx")
val Project.androidxLifecycleRuntimeCompose: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.lifecycle.runtime.compose")
val Project.androidxLifecycleRuntimeKtx: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.lifecycle.runtime.ktx")
val Project.androidxLifecycleViewModelCompose: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.lifecycle.viewmodel.compose")
val Project.androidxNavigationCompose: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.navigation.compose")
val Project.androidxComposeRuntime: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.compose.runtime")
val Project.androidxTestCore: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.test.core")
val Project.androidxTestExtJunit: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.test.ext.junit")
val Project.androidxTestRunner: Provider<MinimalExternalModuleDependency> get() = getLibrary("androidx.test.runner")
val Project.junit: Provider<MinimalExternalModuleDependency> get() = getLibrary("junit")
val Project.koinAndroid: Provider<MinimalExternalModuleDependency> get() = getLibrary("koin.android")
val Project.koinCompose: Provider<MinimalExternalModuleDependency> get() = getLibrary("koin.compose")
val Project.koinTest: Provider<MinimalExternalModuleDependency> get() = getLibrary("koin.test")
val Project.kotlinxCoroutinesAndroid: Provider<MinimalExternalModuleDependency> get() = getLibrary("kotlinx.coroutines.android")
val Project.kotlinxCoroutinesTest: Provider<MinimalExternalModuleDependency> get() = getLibrary("kotlinx.coroutines.test")
val Project.gradleKotlin: Provider<MinimalExternalModuleDependency> get() = getLibrary("gradle.kotlin")
val Project.timber: Provider<MinimalExternalModuleDependency> get() = getLibrary("timber")
