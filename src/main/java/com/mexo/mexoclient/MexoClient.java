package com.mexo.mexoclient;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client-Entrypoint für den Mexo Client.
 * Mixins übernehmen das Ersetzen des TitleScreens; hier kannst du später Keybinds,
 * Renderer-Registrierungen oder clientseitige Listener hinzufügen.
 */
public class MexoClient implements ClientModInitializer {
    public static final String MOD_ID = "mexoclient";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Mexo Client (client) initialisiert.");

        // Beispiel: Hier können später Client-spezifische Initialisierungen passieren,
        // z.B. Keybinds, custom fonts, Renderer-Registrierungen, ResourceReload listeners.
        //
        // Falls du möchtest, dass ich diese Initialisierungen direkt hinzufüge
        // (z.B. Keybind-Registrierung oder ein einfaches HUD-Element), sag Bescheid.
    }
}
