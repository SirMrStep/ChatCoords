package me.steep.chatcoords;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {

        if(!e.getMessage().contains("[coords]")) return;

        Location loc = e.getPlayer().getLocation();

        int x = loc.getBlockX();
        int y = loc.getBlockY();
        int z = loc.getBlockZ();

        e.setMessage(e.getMessage().replace("[coords]", "[" + x + ", " + y + ", " + z + "]"));

    }

}
