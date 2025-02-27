import com.example.mud.room.Room;
import com.example.mud.npc.NPC;
import com.example.mud.trap.Trap;
import java.util.ArrayList;
import java.util.List;

class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private final List<Room> rooms = new ArrayList<>();
    private final List<NPC> npcs = new ArrayList<>();
    private final List<Trap> traps = new ArrayList<>();

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    @Override
    public IDungeonBuilder addTrap(Trap trap) {
        traps.add(trap);
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(name, rooms, npcs, traps);
    }
}