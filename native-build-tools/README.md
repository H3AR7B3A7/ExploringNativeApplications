# Native Build Tools

## Install

- Install GraalVM
- Set GRAALVM_HOME environment variable
- Install a C developer environment
- gu install native-image

*Currently gu command can't be used in Powershell because the name is taken, just use another shell.*

## Compile Java Code

> javac Hello.java

> java Hello

> Measure-Command { java Hello }

## Compile Native Image

Using C developer environment: VS 2019 Developer Command Prompt:

> native-image Hello

> ./hello

> Measure-Command { ./hello }