package com.example.mud.trap;

public class Trap {
    private final String type;
    private final String effect;

    public Trap(String type, String effect) {
        this.type = type;
        this.effect = effect;
    }

    @Override
    public String toString() {
        return type + " - " + effect;
    }
}
