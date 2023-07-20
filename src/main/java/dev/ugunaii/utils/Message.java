package dev.ugunaii.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import dev.ugunaii.Main;

public class Message {

  // void for sending messages to players.
  public static void sendPlayer(Player sender, String message) {
    // Color the message, add the prefix in the config and send it.
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
        JavaPlugin.getPlugin(Main.class).getConfig().getString("Messages.prefix") + "&f" + message));
  }

  // Void for sending messagees to the console.
  public static void sendConsole(String message) {
    // Color the message, add the prefix in the config and send it.
    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',
        JavaPlugin.getPlugin(Main.class).getConfig().getString("Messages.prefix") + "&f" + message));
  }

  // Void for sending messages to command senders.
  public static void sendCommand(CommandSender sender, String message) {
    // Color the message, add the prefix in the config and send it.
    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
        JavaPlugin.getPlugin(Main.class).getConfig().getString("Messages.prefix") + "&f" + message));
  }

}
