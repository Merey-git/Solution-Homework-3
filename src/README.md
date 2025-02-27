# Dungeon Builder (Dark Citadel)

## Overview
This project demonstrates the **Builder Pattern** by constructing a dungeon named *Dark Citadel*. The dungeon consists of rooms, NPCs (Non-Player Characters), and traps, allowing step-by-step configuration and customization.

## Features
- **Dungeon Builder**: Step-by-step creation of a dungeon.
- **Rooms**: Different rooms within the dungeon.
- **NPCs**: Non-player characters, including a boss enemy.
- **Traps**: Hazardous elements to challenge adventurers.
- **Modular Design**: Uses the Builder pattern for flexibility and scalability.

## File Structure
```
/src/
│── IDungeonBuilder.java   # Interface for dungeon creation
│── SimpleDungeonBuilder.java  # Concrete builder class
│── Dungeon.java  # The final dungeon class
│── MUDBuilderDemo.java  # Demonstration of the builder pattern

/src/com/example/mud/room/
│── Room.java  # Room class with name and description

/src/com/example/mud/npc/
│── NPC.java  # NPC class representing characters in the dungeon

/src/com/example/mud/trap/
│── Trap.java  # Trap class representing dungeon hazards
```


## Expected Output
When you run `MUDBuilderDemo.java`, you should see output similar to this:
```
Dungeon: Dark Citadel
Rooms: 2
NPCs: 1
Traps: 2
```

## Example Dungeon Setup
```java
Room room1 = new Room("Shadow Hall", "A gloomy corridor filled with eerie whispers.");
Room room2 = new Room("Blood Chamber", "A sinister room stained with the remains of past intruders.");
NPC boss = new NPC("Dark Overlord", "A fearsome entity guarding the citadel's secrets.");
Trap fireTrap = new Trap("Hellfire Trap", "Unleashes an inferno upon unsuspecting victims.");
Trap spikeTrap = new Trap("Impaling Spikes", "Sharp spikes shoot up from the floor.");

Dungeon dungeon = new SimpleDungeonBuilder()
    .setDungeonName("Dark Citadel")
    .addRoom(room1)
    .addRoom(room2)
    .addNPC(boss)
    .addTrap(fireTrap)
    .addTrap(spikeTrap)
    .build();

dungeon.describe();
```


## Author
Kuanyshkhan Merey
