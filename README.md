# Mousefix for 1.8.9

## How to use the mod

1. Download the JNativeHook jar from the [Maven Repository][repo] or directly from [here][direct] 
2. Download or build the mousefix mod jar
3. Place both jars in your forge mods folder

[repo]:https://mvnrepository.com/artifact/com.1stleg/jnativehook/2.1.0
[direct]:https://repo1.maven.org/maven2/com/1stleg/jnativehook/2.1.0/jnativehook-2.1.0.jar

## How to develop the mod

### Setting up the project:  

    ./gradlew setupDecompWorkspace
    ./gradlew eclipse

### Testing in game:  

    ./gradlew runClient

### Building the mod jar:  

    ./gradlew build

Mod jar is in build/libs/mousefix-x.x.x.jar