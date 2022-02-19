package edu.poniperro;

public class AgedBrie extends Item implements IUpdateable {
    private static final int MAX_QUALITY = 50;

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public int getQuality() {
        return this.quality;
    }

    public void increaseQuality(int increment) {
        this.quality += increment;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public void decreaseSellIn() {
        this.sellIn -= 1;
    }

    @Override
    public void updateQuality() {
        if (getQuality() < MAX_QUALITY && getSellIn() > 0) {
            increaseQuality(1);
        }
        if (getQuality() < MAX_QUALITY && getSellIn() <= 0) {
            increaseQuality(2);
        }
        decreaseSellIn();
    }
}
