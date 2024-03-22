pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://github.com/hailoan/library/blob/main")
            isAllowInsecureProtocol = true
        }
        mavenLocal()
    }
}

rootProject.name = "DistributionLibraryArtifact"
include(":app")
include(":mylibrary2")
