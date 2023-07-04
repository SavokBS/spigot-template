package com.template;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onDisable() { 
	}
	
	@Override
	public void onEnable() { 
		
		// getServer().getPluginManager().registerEvents(new Events(), this); - REGISTER EVENTS
		// getCommand("command").setExecutor(new Command()); - REGISTER COMMAND
	}

}
