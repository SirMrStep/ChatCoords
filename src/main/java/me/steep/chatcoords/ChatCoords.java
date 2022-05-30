package me.steep.chatcoords;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatCoords extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ChatListener(), this);
    }
}
