package com.budderman18.tooexpensivefix;

import com.budderman18.tooexpensivefix.event.anvilListener;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class TooExpensiveFix extends JavaPlugin {


    @Override
    public void onEnable() {
        Metrics metrics = new Metrics(this, 21062);
        registerEvent();
        getLogger().info("-----------------------");
        getLogger().info(getName() + " v" + getDescription().getVersion());
        getLogger().info("The plugin is enabled.");
        getLogger().info("-----------------------");
    }

    @Override
    public void onDisable() {
        getLogger().info("------------------------");
        getLogger().info(getName() + " v" + getDescription().getVersion());
        getLogger().info("The plugin is disabled.");
        getLogger().info("------------------------");
    }

    private void registerEvent() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new anvilListener(), this);
    }
}
