package com.novavisuals.module;

public class Module {

    private final String name;
    private boolean enabled;

    public Module(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void toggle() {
        enabled = !enabled;
    }

    public void onEnable() {
    }

    public void onDisable() {
    }
}
