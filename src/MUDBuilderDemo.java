import com.example.mud.room.Room;
import com.example.mud.npc.NPC;
import com.example.mud.trap.Trap;

class MUDBuilderDemo {
    public static void main(String[] args) {
        Room room1 = new Room("Shadow Gate", "An ominous entrance shrouded in darkness.");
        Room room2 = new Room("Forbidden Vault", "A chamber filled with cursed relics and ancient secrets.");
        NPC boss = new NPC("Dark Overlord", "A malevolent ruler who commands the shadows.");
        Trap fireTrap = new Trap("Hellfire Pit", "Unholy flames rise from the depths, consuming intruders.");
        Trap spikeTrap = new Trap("Impaling Spikes", "Deadly spikes emerge from the stone floor, awaiting the unwary.");

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Citadel")
                .addRoom(room1)
                .addRoom(room2)
                .addNPC(boss)
                .addTrap(fireTrap)
                .addTrap(spikeTrap)
                .build();

        dungeon.describe();
    }
}