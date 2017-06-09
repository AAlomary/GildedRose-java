package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                qualityDecreaseProcessor(i);
            } else {
                if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (items[i].sellIn < 11) {
                        qualityIncreaseProcessor(i);
                        qualityIncreaseProcessor(i);
                    }
                    if (items[i].sellIn < 6) {
                        qualityIncreaseProcessor(i);
                    }
                } else if (items[i].name.equals("Aged Brie")) {
                    qualityIncreaseProcessor(i);
                }
            }
            sellInDecreaseProcessor(i);
            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        qualityDecreaseProcessor(i);
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    qualityIncreaseProcessor(i);
                }
            }
        }
    }


    public void qualityIncreaseProcessor(int i) {
        if (items[i].quality < 50) {
            items[i].quality += 1;
        }
    }

    public void qualityDecreaseProcessor(int i) {
        if (items[i].quality > 0) {
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].quality = items[i].quality - 1;
            }
        }
    }

    public void sellInDecreaseProcessor(int i) {
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].sellIn = items[i].sellIn - 1;
        }
    }

}