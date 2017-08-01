package com.darkzek.WorldProtection;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class WorldProtection extends JavaPlugin implements Listener {

    String permissionNode = "worldprotection.interact";

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        //Check if player has correct permissions
        if (!event.getPlayer().hasPermission(permissionNode)) {
            //Cancel event
            event.setCancelled(true);
        }
    }
}
