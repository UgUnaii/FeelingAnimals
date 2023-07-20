package dev.ugunaii;

import org.bukkit.plugin.java.JavaPlugin;

import dev.ugunaii.commands.MainCommand;
import dev.ugunaii.events.PunchAnimal;
import dev.ugunaii.utils.Message;

public class Main extends JavaPlugin {

  @Override
  public void onEnable() {
    // Initialize the config file
    saveDefaultConfig();
    reloadConfig();

    // Print enabled message
    Message.sendConsole("Plugin enabled!");

    // Call commands
    enableCommands();

    // Call events
    enableEvents();
  }

  @Override
  public void onDisable() {
    // Print disable message
    Message.sendConsole("Plugin disabled!");

    // Save the config
    reloadConfig();
    saveConfig();
  }

  // Call the command classes
  public void enableCommands() {
    this.getCommand("feelinganimals").setExecutor(new MainCommand(this));
    this.getCommand("fa").setExecutor(new MainCommand(this));
  }

  // Call the event classes
  public void enableEvents() {
    this.getServer().getPluginManager().registerEvents(new PunchAnimal(this), this);
  }

}