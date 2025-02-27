import com.example.mud.room.Room;
import com.example.mud.npc.NPC;
import com.example.mud.trap.Trap;

import java.util.List;

class Dungeon {
    private final String name;
    private final List<Room> rooms;
    private final List<NPC> npcs;
    private final List<Trap> traps;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs, List<Trap> traps) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
        this.traps = traps;
    }

    public void describe() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: " + rooms.size());
        System.out.println("NPCs: " + npcs.size());
        System.out.println("Traps: " + traps.size());
    }
}