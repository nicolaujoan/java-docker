package edu.poniperro;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        final int DAYS_IN_MONTH = 30;

        ArrayList<IUpdateable> stock = new ArrayList<IUpdateable>();

        stock.add(new NormalItem("+5 Dexterity Vest", 10, 20));
        stock.add(new AgedBrie("Aged Brie", 2, 0));
        stock.add(new  NormalItem("Elixir of the Mongoose", 5, 7));
        stock.add(new Sulfuras("Sulfuras, Hand of Ragnaros", 0));
        stock.add(new Sulfuras("Sulfuras, Hand of Ragnaros", -1));
        stock.add(new  BackstagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        stock.add(new  BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        stock.add(new  BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        stock.add(new Conjured("Conjured Mana Cake", 3, 6));

        GildedRose shop = new GildedRose(stock);

        System.out.println("--- Bienvenido a Gilded Rose ---\n");
        System.out.println("## Actualizando items... ##\n\n");

        // update stock quality daily
        for (int i = 1; i <= DAYS_IN_MONTH; i++) {
            System.out.println("\n### day " + i + " ###\n");
            shop.updateQuality();
        }
    }
}

