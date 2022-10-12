package shop;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> flowerBuckets;

    public Store() {
        flowerBuckets = new ArrayList<>();
    }

    public void add(FlowerBucket flowerBucket) {
        flowerBuckets.add(flowerBucket);
    }

    public int getSize() {
        return flowerBuckets.size();
    }

    public FlowerBucket search(double price) {
        for (FlowerBucket flowerBucket : flowerBuckets) {
            if (flowerBucket.getPrice() == price) {return flowerBucket;}
        }
        return null;
    }
}
