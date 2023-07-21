# Feeling Animals  
A minecraft server plugin that enhances passive animal behavior.

## 📰 Overview  
This plugin makes other animals flee when one is harmed.  
It uses a fake entity that attacks the mobs in the radius to make them flee, but don't worry, it deals 0 damage. So it's safe.  


## 💾 Downloads  
You can go to the [Releases page](https://github.com/UgUnaii/FeelingAnimals/releases)  
Also the plugin is posted in this pages:
 - [Modrinth](https://modrinth.com/plugin/feeling-animals)
 - [Spigot]()

If you want to support me, you can do it with **Ko-Fi**  
[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/B0B3NEIFJ)

## 📷 Gallery  
Here are a few images of the animals that the plugin changes. If you want to see all the images, you can go to the [Gallery page](https://github.com/UgUnaii/FeelingAnimals/tree/main#-full-gallery).  
![Cow image](https://cdn-raw.modrinth.com/data/r7gLMvcl/images/d9303cc531b62fd2b6665c66e70993eb010e8f3c.gif)  
![Goat image](https://cdn-raw.modrinth.com/data/r7gLMvcl/images/0e0a5968c834e172419064ba6d02772ae7409672.gif)  

## 🖥️ Commands  
The main command is **/feelinganimals** but you can use **/fa** as an abbreviation.  
Here is the list of the command that the plugin provides.  
 - **/fa help** It displays the help menu, with all the commands.  
 - **/fa version** It displays the version of the plugin.  
 - **/fa reload** It reloads the configuration file of the plugin.  

## 🔒 Permissions  
There is only one permission node in the plugin, that makes the player capable of executing the above commands.  
There isn't a permission to make the plugin work, it could be a good feature for the next version.  
 - **feelinganimals.commands** Is the permission node that lets the player execute all plugin commands.  

## ⚙️ Config File
Here is the config file for you to see.  
```yaml
# Feeling Animals, by UgUnaii
# English is not my first language, so you will encounter gramaticall errors. Please don't mind.

# This is the plugin config. You can change it as you like, that's what it is for.

Config:
  # Enable this part to enable the plugin.
  enabled: true

  # The radius is the distance in blocks that will affect other animals and make them also flee.
  # Animals that are not in this zone will not be affected.
  distance-radius: 10

  # The list of animals that will make the the others when punched.
  animal-list:
    - COW
    - CHICKEN
    - PIG
    - SHEEP
    - HORSE
    - FOX
    - GOAT

Messages:
  # This is the prefix that will appear in the beggining of some messages of the plugin.
  # Make sure there is a space at the end, if not, the messages will appear next to the prefix without a space.
  # If you want to remove the prefix, you can just let the prefix in blank, just like this "".
  prefix: "&8[&6Feeling Animals&8] "

  # From here on, you will see the different messages that the plugin will send.
  # You can change or translate them as you want.
  # The default color for every message is white (&f), so if you don't put a color indicator in the beggining of a message, it will be white.
  no-permission: "&cSorry&f, but you don't have the &cpermission &fto execute this command."

  config-reloaded: "The config has been &areloaded&f."

  argument-needed: "&cSorry&f, you must provide an &cargument&f."

  invalid-argument: "&cSorry&f, the argument that you provided is &cinvalid&f."

  # You can use the variable ${version} where you like the most, but only in this message, in the others will not work.
  display-version: "The current version from the plugin is: ${version}"

  get-help: "If you need help, try using the &6/fa help &fcommand."

  # Here you can use the char \n to make a line jump.
  display-help: "This are the commands and their usage that the plugin provides.\n
  The main command is &6/feelinganimals &for &6/fa &ffor abbreviation.\n
  - &6/fa help &fdisplays this message.\n
  - &6/fa version &fdisplays the version of the plugin.\n
  - &6/fa reload &freloads the config file of the plugin."
```

## 📷 Full Gallery  
Here are all the images for all the mobs that the plugin currently modifies.  
![Cow image](https://cdn-raw.modrinth.com/data/r7gLMvcl/images/d9303cc531b62fd2b6665c66e70993eb010e8f3c.gif)  
![Chicken image](https://cdn-raw.modrinth.com/data/r7gLMvcl/images/3636af0336e37a66d948f03ba35a5e2c62ff8e05.gif)  
![Pig image](https://cdn-raw.modrinth.com/data/r7gLMvcl/images/3b909cf20cbd53c7127128a7f002d7104dccdc9a.gif)  
![Sheep image](https://cdn-raw.modrinth.com/data/r7gLMvcl/images/c082f2ff167da1139e2ab255bca284371eb3780f.gif)  
![Horse image](https://cdn-raw.modrinth.com/data/r7gLMvcl/images/3e15df63e77c95a96753023e12ef648bf8ce6422.gif)  
![Fox image](https://cdn-raw.modrinth.com/data/r7gLMvcl/images/91cd69d02b19ec5956809584c3c7bb390ef8cae5.gif)  
![Goat image](https://cdn-raw.modrinth.com/data/r7gLMvcl/images/0e0a5968c834e172419064ba6d02772ae7409672.gif)  

## ❓ FAQ 
You can use this plugin for any server that you like. 
You are not obligated to credit the plugin if you will use it in a video or something like that, although you can if you want.
