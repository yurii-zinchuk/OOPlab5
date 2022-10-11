
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shop.Flower;
import shop.FlowerBucket;
import shop.FlowerPack;
import shop.Rose;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    @Test
    public void testPrice() {
        assertEquals(100, flowerBucket.getPrice());
    }

}
