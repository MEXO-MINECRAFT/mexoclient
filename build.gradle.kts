plugins {
    java
    id("fabric-loom") version "1.17"
}

group = "com.mexo"
version = "1.0.0"

java {
    toolchain { languageVersion.set(JavaLanguageVersion.of(17)) }
}

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
}

dependencies {
    // Minecraft / mappings / fabric api - überprüfe die genauen Versionen für 1.26.2 bei Bedarf
    minecraft("com.mojang:minecraft:1.26.2")

    // Für Minecraft 1.26.2 sind Mojang (official) mappings empfohlen. Falls du Probleme beim Kompilieren hast,
    // ersetze die folgende Zeile mit der für deine Loom-Version passenden Mappings-Deklaration.
    // Beispiele: mappings("official") oder mappings("net.fabricmc:yarn:...") je nach Loom-Version.
    // Die richtige Syntax hängt von deiner Fabric Loom-Version ab.
    // mappings("official")

    modImplementation("net.fabricmc:fabric-api:0.161.0+26.2")
}

// Hinweis: Passe Fabric Loom / Gradle-Version an, wenn Fehler auftreten.
