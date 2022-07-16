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

Add these configuration to the build file:

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