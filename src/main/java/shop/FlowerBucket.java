package shop;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> FlowerPacks;
    private int price = 0;

    public FlowerBucket() {
        FlowerPacks = new ArrayList<FlowerPack>();
    }

    public void add (FlowerPack flowerPack) {
        FlowerPacks.add(flowerPack);
        price += flowerPack.getPrice();
    }

    public int getPrice () {
        return price;
    }
}

