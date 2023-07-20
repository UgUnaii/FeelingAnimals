package dev.ugunaii.events;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Husk;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import dev.ugunaii.FeelingAnimals;

public class PunchAnimal implements Listener {

  // Acces the main class.
  private final FeelingAnimals plugin;

  public PunchAnimal(FeelingAnimals plugin) {
    this.plugin = plugin;
  }

  // Get the event where some entity gets damaged by other entity.
  @EventHandler
  public void onEntityDamage(EntityDamageByEntityEvent event) {

    // Check if the module is enabled in the config.
    String enabled = plugin.getConfig().getString("Config.enabled");
    if (enabled == null || !enabled.equalsIgnoreCase("true")) {
      return;
    }

    // Check if the entity that is punching is a player.
    if (!(event.getDamager() instanceof Player)) {
      return;
    }


    // Check if the punched animal is in the config list.
    if (plugin.getConfig().getStringList("Config.animal-list")
            .contains(event.getEntity().getType().name())) {

      // Create variables.
      Player damager = (Player) event.getDamager();

      // Get a list of the animals in the given radius.
      double detectionRadius = plugin.getConfig().getDouble("Config.distance-radius");

      List<Entity> nearbyEntities = (List<Entity>) damager.getWorld().getNearbyEntities(damager.getLocation(),
              detectionRadius, detectionRadius, detectionRadius);

      // Remove the punched animal from the list.
      nearbyEntities.remove(event.getEntity());

      // Also remove the player from the list.
      nearbyEntities.remove(damager);

      // For every entity in the radius, call the flee method.
      for (Entity e : nearbyEntities) {
        makeEntityFlee(((LivingEntity) e));
      }

    }

  }

  // Method to make the animal flee.
  private void makeEntityFlee(LivingEntity e) {
    World world = e.getLocation().getWorld();
    assert world != null;

    // Create a fake entity.
    Husk fakeEntity = (Husk) world.spawnEntity(e.getLocation(), EntityType.HUSK);

    // Give the fake entity params.
    fakeEntity.setInvisible(true);
    fakeEntity.setInvulnerable(true);
    fakeEntity.setSilent(true);
    fakeEntity.setCustomNameVisible(true);
    fakeEntity.setCustomName("FakeEntity");

    // Get the health of the animal.
    double initialhealth = e.getHealth();

    // Make the fake entity punch the animal to scare him.
    fakeEntity.attack(e);

    // Destore the initial health of the animal so it stays the same.
    e.setHealth(initialhealth);

    // Delete the fake entity after 40 ticks (2 seconds).
    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, fakeEntity::remove, 40);
  }
}