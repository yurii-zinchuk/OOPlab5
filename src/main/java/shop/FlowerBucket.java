package shop;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks;
    private double price = 0;

    public FlowerBucket() {
        flowerPacks = new ArrayList<>();
    }

    public void add (FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
        price += flowerPack.getPrice();
    }

    public double getPrice () {
        return price;
    }
}

