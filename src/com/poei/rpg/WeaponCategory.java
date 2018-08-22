package com.poei.rpg;

import java.util.ArrayList;
import java.util.List;

public class WeaponCategory {
    private String name;
    private boolean magick;
    private List<PlayerClass> classes = new ArrayList<>();

    /**
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * @return the magick
     */
    public final boolean isMagick() {
        return magick;
    }

    /**
     * @param magick the magick to set
     */
    public final void setMagick(boolean magick) {
        this.magick = magick;
    }

    /**
     * @return the classes
     */
    public final List<PlayerClass> getClasses() {
        return classes;
    }

    /**
     * @param classes the classes to set
     */
    public final void setClasses(List<PlayerClass> classes) {
        this.classes = classes;
    }
}
