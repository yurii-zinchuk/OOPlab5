package shop;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Flow;

@Getter @Setter
public class Flower {
    private int sepalLength;
    private int price;
    private FlowerColor color;

    public Flower () {}

    public Flower (int price, int sepalLength, FlowerColor color) {
        this.price = price;
        this.sepalLength = sepalLength;
        this.color = color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }
}
