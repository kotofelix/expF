package fruitBase.fruits;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Fruit {
    protected String name;
    protected double weight;
    protected BigDecimal price;
    protected Freshness freshness;

    public Fruit(String name, double weight, BigDecimal price, Freshness freshness) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.freshness = freshness;
    }

    public Fruit(String name) {
        this.name = name;
        this.freshness = Freshness.FRESH;
    }

    public Fruit(String name, double weight, BigDecimal price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.freshness = Freshness.FRESH;
    }

    public double getWeight() {
        return this.weight;
    }

    public abstract double getTotalWeight();

    public BigDecimal getPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public Freshness getFreshness() {
        return freshness;
    }

    public boolean isFresh() {
        return freshness == Freshness.FRESH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0 && name.equals(fruit.name)
                && price.equals(fruit.price)
                && freshness == fruit.freshness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price, freshness);
    }
}


