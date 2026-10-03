# Mexo Client (Fabric) - README

Dieses Repository enthält ein minimales Fabric-Mod-Gerüst, das den TitleScreen durch einen einfachen, pinken "MEXO CLIENT"-Screen ersetzt.

Was ist enthalten:
- Quellcode (Client entrypoint, TitleScreen-Klasse, Mixin)
- Platzhalter-Ressourcen-Verzeichnis (assets/...) — lege dort deine logo.png und background.png ab
- build.gradle.kts (Mit Platzhalter-Versionen für Loom / Fabric API)

Download & Test:
1) Lade das gesamte Repository als ZIP herunter: https://github.com/MEXO-MINECRAFT/mexoclient/archive/refs/heads/main.zip
2) Entpacke und öffne ein Terminal im Projekt-Root.
3) Passe bei Bedarf die Versionen in build.gradle.kts (Fabric Loom / Fabric API / Mappings) an — siehe Kommentar in der Datei.
4) Führe lokal aus (Linux/macOS):
   ./gradlew genSources
   ./gradlew runClient
   (Windows: gradlew.bat ...)

Hinweis: Für Minecraft 1.26.2 werden Mojang-"official"-Mappings empfohlen und aktuelle Fabric-Tools. Wenn du möchtest, kann ich eine GitHub Action hinzufügen, die automatisch eine lauffähige JAR baut und als Download bereitstellt.
