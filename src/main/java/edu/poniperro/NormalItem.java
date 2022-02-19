package edu.poniperro;

public class NormalItem extends Item implements IUpdateable{
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public int getSellIn() {
        return this.sellIn;
    }

    public int getQuality() {
        return this.quality;
    }

    public void decreaseSellIn() {
        this.sellIn -= 1;
    }

    public void decreaseQuality(int decrement) {
        this.quality -= decrement;
    }

    @Override
    public void updateQuality() {
        if (getSellIn() <= 0 && getQuality() > 1) {
            decreaseQuality(2);
        }
        if (getSellIn() > 0 && getQuality() > 0) {
            decreaseQuality(1);
        }
        decreaseSellIn();
    }
}
