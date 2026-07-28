package com.novavisuals.module.impl;

import com.novavisuals.module.Module;

public class ZoomModule extends Module {

    public ZoomModule() {
        super("Zoom");
    }

    @Override
    public void onEnable() {
        System.out.println("Zoom enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("Zoom disabled");
    }
}
