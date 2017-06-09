package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void agedBrieValueIncreasesAsTimeGoesOn(){
        Item[] items = new Item[] { new Item("Aged Brie", 0, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(7, app.items[0].quality);
    }

    @Test
    public void backstagePassShouldWorkPlease1(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 1, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(33, app.items[0].quality);
    }

    @Test
    public void backstagePassShouldWorkPlease2(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 7, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(32, app.items[0].quality);
    }

    @Test
    public void backstagePassShouldWorkPlease3(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(30, app.items[0].quality);
    }

}
