package com.budderman18.tooexpensivefix;

import com.budderman18.tooexpensivefix.event.anvilListener;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class TooExpensiveFix extends JavaPlugin {


    @Override
    public void onEnable() {
		registerMetrics();
        registerEvent();
        getLogger().info("-----------------------");
        getLogger().info(this.getName() + " v" + this.getDescription().getVersion());
        getLogger().info("The plugin is enabled.");
        getLogger().info("-----------------------");
    }

    @Override
    public void onDisable() {
        getLogger().info("------------------------");
        getLogger().info(this.getName() + " v" + this.getDescription().getVersion());
        getLogger().info("The plugin is disabled.");
        getLogger().info("------------------------");
    }

	private void registerMetrics() {
		Metrics metrics = new Metrics(this, 21062);
	}

    private void registerEvent() {
        PluginManager pluginmanager = getServer().getPluginManager();
        pluginmanager.registerEvents(new anvilListener(), this);
    }
}