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
        ItemStack original = event.getInventory().getItem(0);
        ItemStack result = event.getInventory().getItem(2);
        if (original == null || result == null) return;
        if (!original.hasItemMeta() || !result.hasItemMeta()) return;
        if (!original.getItemMeta().getDisplayName().equals(result.getItemMeta().getDisplayName()) && event.getInventory().getItem(1) == null) {
            event.getInventory().setRepairCost(1);
        }
    }
}
