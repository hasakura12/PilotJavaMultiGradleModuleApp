# Pilot Java Multiple Gradle Module App

# This step will create an executable JAR for the multi-module project (aka fat jar)
```
gradle shadowJar
```

Then run the JAR:

```
cd app/build/libs
```

```
java -jar app-all.jar
```

And you should get
```
The current local time is: 15:47:28.506
INFO  - HelloWorld                 - Received message: Hello World!
```


# This step will not create an executable JAR but will build, package, and create binary distributions

```
./gradlew build
```

## How to run only tests
```
./gradlew test
```


## How to run the application
just execute

```
./gradlew run
```

or 

you can run the application by following these steps:

1. Unpackage the binary distribution in
    ```
    app/build/distributions
    ```
2. Run the application by invoking the correct startup script found from the bin directory.

