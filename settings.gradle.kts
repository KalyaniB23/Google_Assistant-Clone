

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        //noinspection JcenterRepositoryObsolete
        jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        //noinspection JcenterRepositoryObsolete
        jcenter()
        maven(url = "https://jitpack.io")
    }
}

rootProject.name = "GoogleAssistant"
include(":app")