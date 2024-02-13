package com.budderman18.tooexpensivefix;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class TooExpensiveFix extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
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

    @EventHandler
    public void onAnvilUse(PrepareAnvilEvent event) {
        event.getInventory().setMaximumRepairCost(21862);
        if (event.getInventory().getItem(2) != null) {
            if (event.getInventory().getItem(0).getItemMeta().getDisplayName() != event.getInventory().getItem(2).getItemMeta().getDisplayName() && event.getInventory().getItem(1) == null) {
                event.getInventory().setRepairCost(1);
            }
        }
    }
}