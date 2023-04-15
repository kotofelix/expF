package fruitBase.fruits;

import java.math.BigDecimal;

public class Apple extends Fruit {

    public Apple(double weight, double price) {
        super("Apple", weight, BigDecimal.valueOf(price));
        this.freshness = Freshness.FRESH;
    }

    public Apple(double weight, double price, Freshness freshness) {
        super("Apple", weight, BigDecimal.valueOf(price), freshness);
    }

//   public Apple() {
//       super("Apple");
//   }

    @Override
    public double getTotalWeight() {
        return getWeight();
    }

    @Override
    public String getName() {
        return "яблоко";
    }
}