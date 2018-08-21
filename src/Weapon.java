
public class Weapon extends Stuff {
    private WeaponCategory category;
    
    private enum Hands {
        FIRST, SECOND, TWO
    }
    
    /**
     * 
     */
    private Hands hands = Hands.TWO;

    /**
     * @return the category
     */
    public final WeaponCategory getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public final void setCategory(WeaponCategory category) {
        this.category = category;
    }

    /**
     * @return the hands
     */
    private Hands getHands() {
        return this.hands;
    }

    /**
     * @param hands the hands to set
     */
    public void setHands(Hands hands) {
        this.hands = hands;
    }
    
    public boolean isSecondHand() {
        return this.getHands() == Hands.SECOND;
    }
    
    public boolean isTwoHands() {
        return this.getHands() == Hands.TWO;
    }
}
