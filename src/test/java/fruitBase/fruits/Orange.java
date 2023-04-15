package fruitBase.fruits;

import java.math.BigDecimal;

public class Orange extends Fruit {
    public Orange(double weight, double price) {
        super("Orange", weight, BigDecimal.valueOf(price));
        this.freshness = Freshness.FRESH;
    }

    public Orange(double weight, double price, Freshness freshness) {
        super("Orange", weight, BigDecimal.valueOf(price), freshness);
    }

    public Orange() {
        super("Orange");
    }

    @Override
    public double getTotalWeight() {
        return getWeight();
    }

    @Override
    public String getName() {
        return "апельсин";
    }
}