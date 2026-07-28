package com.novavisuals.module;

import com.novavisuals.module.impl.ZoomModule;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {

    private final List<Module> modules = new ArrayList<>();

    public ModuleManager() {
        modules.add(new ZoomModule());
    }

    public List<Module> getModules() {
        return modules;
    }
}
