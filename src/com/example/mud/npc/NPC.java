package com.example.mud.npc;

public class NPC {
    private final String name;
    private final String description;

    public NPC(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " - " + description;
    }
}
