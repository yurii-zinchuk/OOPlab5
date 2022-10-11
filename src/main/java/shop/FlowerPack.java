package shop;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int amount;
    private int price;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
        price = amount * flower.getPrice();
    }
}
