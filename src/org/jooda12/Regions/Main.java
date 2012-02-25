package org.jooda12.Regions;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");
	
	public void onDisable() {
		log.info("[REGIONS] Regions Plugin has been Disabled!");
	}

	public void onEnable() {
		log.info("[REGIONS] Regions Plugin has been Enabled!");
	}
}
