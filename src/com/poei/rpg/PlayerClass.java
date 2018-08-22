package com.poei.rpg;

import java.util.ArrayList;
import java.util.List;

public class PlayerClass {
    private String name;
    private boolean magical;
    private List<WeaponCategory> categories = new ArrayList<>();
    private List<Stuff> stuffs = new ArrayList<>();
    private HeadStuff headStuff;
    private BodyStuff bodyStuff;
    private Weapon firstHand;
    private Weapon secondHand;

    /** 
     * Permet de changer l'équipement de tête.
     * 
     * Il s'agit de la solution la plus simple, et serait rapide mais nous avons une grosse redondance de méthodes
     * (il faut créer la même méthode pour chaque bout d'équipement). Nous avonc donc choisi la solution suivante avec
     * {@link equip} qui utilise le polymorphisme.
     */
    @SuppressWarnings("all")
    public boolean equipHead(HeadStuff stuff) {
        boolean result = false;
        
        if (this.stuffs.contains(stuff)) {
            this.headStuff = stuff;
            result = true;
        }
        
        return result;
    }

    public boolean equip(Stuff stuff) {
        boolean result = false;

        if (this.stuffs.contains(stuff)) {
            result = this.equipTrust(stuff);
        }

        return result;
    }

    private boolean equipTrust(Stuff stuff) {
        boolean result = true;

        if (stuff instanceof HeadStuff) {
            this.headStuff = (HeadStuff) stuff;
        } else if (stuff instanceof BodyStuff) {
            this.bodyStuff = (BodyStuff) stuff;
        } else if (stuff instanceof Weapon) {
            if (this.getFirstHand() != null && this.getFirstHand().isTwoHands()) {
                this.setFirstHand(null);
                this.setSecondHand(null);
            }

            Weapon weapon = (Weapon) stuff;

            if (weapon.isSecondHand()) {
                this.setSecondHand(weapon);
            } else {
                this.setFirstHand(weapon);
            }
        } else {
            result = false;
        }

        return result;
    }

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
     * @return the magical
     */
    public final boolean isMagical() {
        return magical;
    }

    /**
     * @param magical the magical to set
     */
    public final void setMagical(boolean magical) {
        this.magical = magical;
    }

    /**
     * @return the categories
     */
    public final List<WeaponCategory> getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public final void setCategories(List<WeaponCategory> categories) {
        this.categories = categories;
    }

    /**
     * @return the stuffs
     */
    public final List<Stuff> getStuffs() {
        return stuffs;
    }

    /**
     * @param stuffs the stuffs to set
     */
    public final void setStuffs(List<Stuff> stuffs) {
        this.stuffs = stuffs;
    }

    /**
     * @return the headStuff
     */
    public final HeadStuff getHeadStuff() {
        return headStuff;
    }

    /**
     * @param headStuff the headStuff to set
     */
    public final void setHeadStuff(HeadStuff headStuff) {
        this.headStuff = headStuff;
    }

    /**
     * @return the bodyStuff
     */
    public final BodyStuff getBodyStuff() {
        return bodyStuff;
    }

    /**
     * @param bodyStuff the bodyStuff to set
     */
    public final void setBodyStuff(BodyStuff bodyStuff) {
        this.bodyStuff = bodyStuff;
    }

    /**
     * @return the firstHand
     */
    public Weapon getFirstHand() {
        return firstHand;
    }

    /**
     * @param firstHand the firstHand to set
     */
    public void setFirstHand(Weapon firstHand) {
        this.firstHand = firstHand;
    }

    /**
     * @return the secondHand
     */
    public Weapon getSecondHand() {
        return secondHand;
    }

    /**
     * @param secondHand the secondHand to set
     */
    public void setSecondHand(Weapon secondHand) {
        this.secondHand = secondHand;
    }
}
