package com.budderman18.tooexpensivefix.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;


public class anvilListener implements Listener {


    @EventHandler
    public void onAnvil(PrepareAnvilEvent event) {
        event.getInventory().setMaximumRepairCost(21862);
        if (event.getInventory().getItem(2) != null) {
            if (event.getInventory().getItem(0).getItemMeta().getDisplayName() != event.getInventory().getItem(2).getItemMeta().getDisplayName() && event.getInventory().getItem(1) == null) {
                event.getInventory().setMaximumRepairCost(1);
            }
        }
    }
}