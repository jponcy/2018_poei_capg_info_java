package com.poei.rpg;

public class PlayablePlayer {
    private String name;
    private Weapon firstHand;
    private Weapon secondHand;
    private PlayerClass playerClass;

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
     * @return the firstHand
     */
    public final Weapon getFirstHand() {
        return firstHand;
    }

    /**
     * @param firstHand the firstHand to set
     */
    public final void setFirstHand(Weapon firstHand) {
        this.firstHand = firstHand;
    }

    /**
     * @return the secondHand
     */
    public final Weapon getSecondHand() {
        return secondHand;
    }

    /**
     * @param secondHand the secondHand to set
     */
    public final void setSecondHand(Weapon secondHand) {
        this.secondHand = secondHand;
    }

    /**
     * @return the playerClass
     */
    public PlayerClass getPlayerClass() {
        return playerClass;
    }

    /**
     * @param playerClass the playerClass to set
     */
    public void setPlayerClass(PlayerClass playerClass) {
        this.playerClass = playerClass;
    }
}
