// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {


    dependencies {
        classpath(libs.hilt.android.gradle.plugin)
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.plugins {
    plugins {
        alias(libs.plugins.android.application) apply false
        alias(libs.plugins.jetbrains.kotlin.android) apply false
        id("com.android.library") version("7.1.0") apply false
    }
