package edu.poniperro;

import java.util.ArrayList;

class GildedRose implements IUpdateable {
    public ArrayList<IUpdateable> stock;

    GildedRose(ArrayList<IUpdateable> items) {
        this.stock = items;
    }

    @Override
    public void updateQuality() {
        for (IUpdateable item:stock
             ) {
            item.updateQuality();
            System.out.println(item);
        }
    }

    public void addItem(IUpdateable newItem) {
        stock.add(newItem);
    }
}
