This is simple application for demonstrating the usage of GhostWriter.
It contains a commented build file for Maven, Ant and Gradle as well. The relevant lines can be copy-pasted to your own build scripts.

The FizzBuzz example also depends on the _ghostwriter-rt-example_. In order to run the FizzBuzz sample,
the _ghostwriter-rt-example_ project needs to be built and published into your local maven repository.
This can be done with the following command executed from the _ghostwriter-rt-example_ folder:

```
gradle clean build publishToMavenLocal
```

Assuming that you have a working Ant/Maven/Gradle installation on your specified path, you can see the
"GhostWriter-ed" FizzBuzz application in action by executing one (or all if you are curious) of the following commands:


### Maven

```
mvn clean package exec:java
```

### Ant

```
ant clean run
```

### Gradle
 
```
gradle clean build run
```