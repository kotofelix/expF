package fruitBase.fruits;

import java.math.BigDecimal;

public class Mango extends Fruit {
    public Mango(double weight, double price) {
        super("Mango", weight, BigDecimal.valueOf(price));
        this.freshness = Freshness.FRESH;
    }

    public Mango(double weight, double price, Freshness freshness) {
        super("Mango", weight, BigDecimal.valueOf(price), freshness);
    }

    public Mango() {
        super("Mango");
    }

    @Override
    public double getTotalWeight() {
        return getWeight();
    }

    @Override
    public String getName() {
        return "манго";
    }
}