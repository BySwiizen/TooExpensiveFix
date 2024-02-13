package com.budderman18.tooexpensivefix;

import com.budderman18.tooexpensivefix.event.anvilListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class TooExpensiveFix extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
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
        getServer().getPluginManager().registerEvents(new anvilListener(), this);
    }
}