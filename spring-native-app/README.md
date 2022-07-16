# Spring Native

[Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

## settings.gradle

At the top of the file:

```groovy dsl
pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url 'https://repo.spring.io/release' }
    }
}
```

## build.gradle

Add this configuration to the build file:

```groovy dsl
plugins {
    // ...
    id 'org.springframework.experimental.aot' version '0.12.1'
}

repositories {
    // ...
    maven { url 'https://repo.spring.io/release' }
}

bootBuildImage {
    builder = "paketobuildpacks/builder:tiny"
    environment = [
            "BP_NATIVE_IMAGE" : "true"
    ]
    buildpacks = ["gcr.io/paketo-buildpacks/java-native-image:7.19.0"]
}
```

## Build & Run Image

> gradle bootBuildImage

> docker run --rm -p 8080:8080 spring-native-app:0.0.1-SNAPSHOT

> docker run --name spring-native-app -p 8080:8080 spring-native-app:0.0.1-SNAPSHOT

## Compiling Using Native Build Tools

Requirements:
- Install GraalVM
- Set GRAALVM_HOME environment variable
- Install a C developer environment
- gu install native-image

> gradle nativeCompile

*Make sure to use x64 Native Tools Command Prompt instead of the regular Windows command line to run Maven or Gradle plugins.*

## Run the Application

> target/spring-native-app

## Test Native Application

> gradle nativeTest