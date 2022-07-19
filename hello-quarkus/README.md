# Quarkus

## What It Is

"Supersonic Subatomic Java Toolkit"

Speed:

- Fast boot
- Fast for 1st request
- Code, test, iterate
- Develop fast

Size:

- Reduces memory
- Small binary
- Low resource consumption

Polyglot

- JVM languages
- C, C++, Ruby, etc.
- Java first

"A Kubernetes Native Java stack tailored for OpenJDK HotSpot and GraalVM, crafted from the best of breed Java libraries
and standards"

Kubernetes native

- Container first
- Orchestration platforms
- Docker images
- Kubernetes deployment
- K-Native
- Cloud-Native

HotSpot and GraalVM

- All flavors of Java
- JVM HotSpot
- First class support for GraalVM
- Native binary

Libraries and Standards

- Built on top of proven standards
- Integrates well-known libraries
- Hundreds of libraries
- In-house frameworks running on the JVM

Microservices & Functions

- Develop any kind of application
- Microservices and functions addressed bu Quarkus
- Microservices is the most popular architecture
- Function as a Service (Serverless)
- Quarkus reduces complexity to develop and deploy

Reactive

- Elastic
- Resilient
- Responsive
- Message-Driven
- Quarkus integrates Netty and Vert.x
- Non-blocking Java frameworks
- Unifies imperative and reactive programming seamlessly

Open Source

- https://github.com/quarkusio

Ecosystem

- Extensions
- Quarkiverse
- https://github.com/quarkiverse
- Repository hosting
- Contributed by the community

### History

Created by: Red Hat

- Open source company
- Red hat enterprise Linux
- Acquired JBoss
- Entered Java ecosystem
- Java SE, Jakarta EE and MicroProfile
- GraalVM and Mandrel
- Cloud platform OpenShift
- Gives Quarkus production support

Genesis

- JBoss Application Server (1999)
- WildFly - open-source (2014)
- WildFly Swarm / aka Thorntail (2015)
- Quarkus 0.0.1 (2018)
- Quarkus 1.0 (2019)
- Quarkus 2.9.1 (2022)

### Purpose

"Quarkus pushes Java to the Cloud"

From monolith ... to micro-services ... to functions.

JVMs consume resources, memory and startup time which lowers the density of applications on a container platform.
Quarkus increases density of Java application per container (like languages as nodeJS or native languages like Go).

## How It Works

### GraalVM

- Extension of the JVM
- Polyglot
- Native Images
- Performance of native languages
- Fast startup and low memory footprint

GraalVM Architecture:

- Graal Compiler (Java, Scala, Groovy)
    - Dynamic compilation
        - JVM compiler interface
        - HotSpot (JIT compilation)
    - Static compilation
        - Substrate VM (AOT compilation)
- Truffle framework for other languages like: R, Ruby, JS, Python, ...
- Sulong for LLVM based languages like: C, C++, Fortran, ...

### Quarkus Architecture

- Runs both on Hotspot (JIT) & GraalVM (AOT)
- Small core
- Quarkus extensions
- External libraries (3d party, in-house, ...)
- Arc (lightweight dependency injection framework)
- Jandex (Java annotation indexer and reflection library to optimize annotation processing)
- Gizmo (Produce Java bytecode)
- Graal SDK (Single path, single class loader and dead code elimination)

### At Buildtime vs Runtime

- Work is done once, not at each start
- Less or no reflection nor dynamic proxies
- Less time to start, less memory usage
- (Even on hotspot, even more so when building a native binary with GraalVM)

### Metrics

Quarkus + Hotspot (JIT): 4x speed, 50% memory
Quarkus + GraalVM (AOT): 100x speed, 15% memory

### Extensions vs Library

Extensions:

- Developed and maintained by the Quarkus team
- Quarkus GitHub repo
- Integrates seamlessly into Quarkus
- Processed at build time
- Built in native mode

Library:

- In-house framework
- External 3d party library
- Might not natively compile out of the box
- Works on JVM mode
- Not sure on native mode and build-time

### Extensions

- Web
    - Servlet
    - RESTEasy
    - JSON Binding and JSON Processing
    - OpenAPI
    - gRPC
    - GraphQL
- Data
    - Hibernate (ORM, Validator, Envers)
    - Transaction
    - Relational DB (PostgreSQL, MariaDB, H2, ...)
    - MongoDB
    - Amazon S3
    - Elasticsearch
- Messaging
    - JMS (Java Messaging Service)
    - Kafka
    - Kafka streams
    - AMQP (Advanced Message Queuing Protocol)
    - MQTT (Message Queuing Telemetry Transport)
- Reactive
    - Vert.x
    - Reactive Programming (Mutiny)
    - Reactive Messaging
    - RESTEasy Reactive
    - Hibernate Reactive
    - Reactive R2DBC drivers
- Cloud
    - Docker, Jib
    - Kubernetes, Minikube
    - OpenShift, AWS, Azure, Google Cloud
    - Function as a Service (Funqy)
- Observability
    - Health checks
    - Micrometer metrics
    - Distributed tracing
- Security
    - OpenID Connect
    - JWT
    - Elytron
    - Keycloak
    - Vault
- Miscellaneous
    - Mailer
    - Picocli
    - Quartz, Scheduler
    - Spring integration