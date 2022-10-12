package shop;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Flow;

@Getter @Setter
public class Flower {
    private double sepalLength;
    private double price;
    private String color;

    public Flower () {}

    public Flower (double price, double sepalLength, FlowerColor color) {
        this.price = price;
        this.sepalLength = sepalLength;
        setColor(color);
    }


    public void setColor(FlowerColor color) {
        this.color = color.toString();
    }
}

