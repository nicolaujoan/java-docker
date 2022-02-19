package edu.poniperro;

public class Sulfuras extends Item implements IUpdateable{

    public Sulfuras(String name, int sellIn) {
        super(name, sellIn, 80);
    }

    @Override
    public void updateQuality() {}
}
