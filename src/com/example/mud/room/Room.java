package com.example.mud.room;

public class Room {
    private final String name;
    private final String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + ": " + description;
    }
}
