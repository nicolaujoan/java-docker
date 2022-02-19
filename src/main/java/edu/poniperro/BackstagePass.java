package edu.poniperro;

public class BackstagePass extends Item implements IUpdateable {
    private static final int MAX_QUALITY = 50;

    public BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public int getQuality() {
        return this.quality;
    }

    public void increaseQuality(int increment) {
        this.quality += increment;
    }

    public void decreaseQuality(int decrement) {
        this.quality -= decrement;
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public void decreaseSellIn() {
        this.sellIn -= 1;
    }

    @Override
    public void updateQuality() {
        if (getSellIn() <= 0 && getQuality() >= 0) {
            decreaseQuality(getQuality());
        }
        else if (getSellIn() <= 5 && getQuality() < (MAX_QUALITY - 2)) {
            increaseQuality(3);
        }
        else if (getSellIn() <= 10 && getQuality() < (MAX_QUALITY - 1)) {
            increaseQuality(2);
        }
        else {
            increaseQuality(1);
        }
        decreaseSellIn();
    }
}
