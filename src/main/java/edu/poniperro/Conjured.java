package edu.poniperro;

public class Conjured extends NormalItem implements IUpdateable {

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (getSellIn() < 0 && getQuality() == 1) {
            decreaseQuality(1);
        }
        if (getSellIn() <= 0 && getQuality() > 1) {
            decreaseQuality(2);
        }
        if (getSellIn() > 0 && getQuality() > 0) {
            decreaseQuality(1);
        }
        decreaseSellIn();
    }
}
