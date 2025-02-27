import com.example.mud.npc.NPC;
import com.example.mud.room.Room;
import com.example.mud.trap.Trap;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    IDungeonBuilder addTrap(Trap trap);
    Dungeon build();
}

