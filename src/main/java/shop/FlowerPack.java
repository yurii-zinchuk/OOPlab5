package shop;

import lombok.Getter;

@Getter
public class FlowerPack {
    private final Flower flower;
    private final int amount;
    private final double price;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
        price = amount * flower.getPrice();
    }
}
