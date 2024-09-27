plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.ninyj"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ninyj"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.5")
    implementation("androidx.activity:activity-compose:1.9.2")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")// Назначение: Retrofit — это библиотека для работы с RESTful API в Android. Она позволяет легко выполнять HTTP-запросы и обрабатывать ответы, поддерживает различные форматы данных, такие как JSON и XML.
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // Gson Converter используется вместе с Retrofit для преобразования JSON-данных в Java-объекты и наоборот. Это позволяет удобно сериализовать и десериализовать данные, получаемые от API, делая работу с ними более простой и понятной.
    implementation("androidx.room:room-runtime:2.3.0") // Назначение: Room — это библиотека для работы с локальными базами данных на платформе Android. Она предоставляет абстракцию над SQLite, позволяя разработчикам работать с базами данных без необходимости писать SQL-запросы.
    implementation("androidx.room:room-compiler:2.3.0") // Назначение: Room Compiler используется для генерации необходимого кода для работы с аннотациями Room.
    implementation("org.achartengine:achartengine:1.2.0") // Назначение: AChartEngine — это библиотека для создания графиков и диаграмм в Android-приложениях.
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0") // Назначение: MPAndroidChart — это современная библиотека для создания графиков и диаграмм в Android-приложениях.
    implementation("com.github.bumptech.glide:glide:4.12.0") // Назначение: Glide — это библиотека для загрузки и кеширования изображений в Android-приложениях.
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")



}