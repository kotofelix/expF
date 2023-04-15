package fruitBase.fruits;

import java.math.BigDecimal;

public class Pineapple extends Fruit {
    public Pineapple(double weight, double price) {
        super("Pineapple", weight, BigDecimal.valueOf(price));
        this.freshness = Freshness.FRESH;
    }

    public Pineapple(double weight, double price, Freshness freshness) {
        super("Pineapple", weight, BigDecimal.valueOf(price), freshness);
    }

    public Pineapple() {
        super("Pineapple");
    }

    @Override
    public double getTotalWeight() {
        return getWeight();
    }

    @Override
    public String getName() {
        return "ананас";
    }
}