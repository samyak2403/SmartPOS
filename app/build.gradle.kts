import org.gradle.internal.impldep.bsh.commands.dir

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.app.smartpos"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.app.smartpos"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        useLibrary("org.apache.http.legacy")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(libs.appcompat)
    implementation(libs.material)
//    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation (libs.cardview)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)



    implementation (libs.toasty)
    implementation (libs.sqliteassethelper)
    implementation (libs.material.ripple)
    implementation (libs.mpandroidchart)
    implementation (libs.dexter)
    implementation (libs.play.services.ads)
    implementation (libs.zxing)
    implementation (libs.multidex)
    implementation (libs.sqlite2xl)
    implementation (libs.android.file.chooser)
    implementation (libs.itextg)
    implementation (libs.android.pdf.viewer)
    implementation (libs.niftydialogeffects)
    implementation (libs.monthandyearpicker)
//    implementation ("com.whiteelephant:month-picker-dialog:1.2.0") // or latest version

    implementation(libs.imagepicker)
}