package dev.ugunaii.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import dev.ugunaii.Main;
import dev.ugunaii.utils.Message;

public class MainCommand implements CommandExecutor {

  // Acces the main class.
  private Main plugin;

  public MainCommand(Main plugin) {
    this.plugin = plugin;
  }

  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    // As all of the commands can be executed by anyone, there is no need to check
    // if the sender is a player or not.

    // Check if the command sender has permissions.
    if (sender.hasPermission("feelinganimals.commands")) {

      // Check if ther are any args.
      if (args.length > 0) {

        if (args[0].equalsIgnoreCase("reload")) { // Command to reload the config file.
          plugin.reloadConfig();
          Message.sendCommand(sender, getMessage("config-reloaded"));

        } else if (args[0].equalsIgnoreCase("version")) { // Command to display the plugin version.
          Message
              .sendCommand(sender, getMessage("display-version"));

        } else if (args[0].equalsIgnoreCase("help")) { // Command to display the help manu.
          Message.sendCommand(sender, getMessage("display-help"));

        } else { // If the argument is not valid.
          Message.sendCommand(sender, getMessage("invalid-argument"));
          Message.sendCommand(sender, getMessage("get-help"));
        }

        // If there aren't any args.
      } else {
        Message.sendCommand(sender, getMessage("argument-needed"));
        Message.sendCommand(sender, getMessage("get-help"));
      }
      // If the player doesn't have the permission.
    } else {
      Message.sendCommand(sender, getMessage("no-permission"));
    }

    return true;
  }

  // Method to get messages from th econfig.
  private String getMessage(String path) {
    return plugin.getConfig().getString("Messages." + path);
  }
}
