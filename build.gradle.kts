
plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.turbomaxim"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.turbomaxim"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

