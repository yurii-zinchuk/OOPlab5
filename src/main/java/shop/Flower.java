package shop;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.Flow;

@Getter @Setter
public class Flower {
    private int sepalLength;
    private int price;
    private String color;

    public Flower () {}

    public Flower (int price, int sepalLength, FlowerColor color) {
        this.price = price;
        this.sepalLength = sepalLength;
//        this.color = color;
        setColor(color);
    }


    public void setColor(FlowerColor color) {
        switch (color) {
            case RED -> this.color = "#FF0000";
            case BLUE -> this.color = "#FF0000";
            case GREEN -> this.color = "#FF0000";
            case ORANGE -> this.color = "#FF0000";
            case YELLOW -> this.color = "#FF0000";
            default -> throw new IndexOutOfBoundsException();
        }
    }
}

