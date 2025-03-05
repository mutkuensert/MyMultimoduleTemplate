import task.CoreModuleCreatorTask
import task.FeatureModuleCreatorTask

// Top-level build file where you can add configuration options common to all sub-projects/modules.
tasks.register<CoreModuleCreatorTask>("createCoreModule") {
    moduleName = project.findProperty("moduleName") as? String
}


tasks.register<FeatureModuleCreatorTask>("createFeatureModule") {
    featureName = project.findProperty("featureName") as? String
}