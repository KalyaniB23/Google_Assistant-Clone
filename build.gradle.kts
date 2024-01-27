// Top-level build file where you can add configuration options common to all sub-projects/modules.


    plugins {
        id("com.android.application") version "8.2.2" apply false
        id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    }
    buildscript {
        val agp_version by extra("8.2.2")
        val agp_version1 by extra("8.1.2")
        dependencies {
            classpath("com.android.tools.build:gradle:$agp_version")
            classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.0-Beta2")
            classpath("com.google.gms:google-services:4.4.0")
            classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
            classpath("com.github.dcendents:android-maven-gradle-plugin:1.5")

        }
    }

    val multidexVersion by extra("1.0.3")








