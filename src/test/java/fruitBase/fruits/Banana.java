package fruitBase.fruits;

import java.math.BigDecimal;

public class Banana extends Fruit {
    public Banana(double weight, double price) {
        super("Banana", weight, BigDecimal.valueOf(price));
        this.freshness = Freshness.FRESH;
    }

    public Banana(double weight, double price, Freshness freshness) {
        super("Banana", weight, BigDecimal.valueOf(price), freshness);
    }

    public Banana() {
        super("Banana");
    }

    @Override
    public double getTotalWeight() {
        return getWeight();
    }

    @Override
    public String getName() {
        return "банан";
    }
}