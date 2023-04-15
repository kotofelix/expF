package fruitBase.customers;

import fruitBase.Cargo;
import fruitBase.fruits.Fruit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public abstract class Customer {
    protected List<Fruit> purchases;
    protected String name;

    public Customer(String name) {
        this.name = name;
        this.purchases = new ArrayList<>();
    }

    public abstract List<Fruit> takeFruits(Cargo cargo);

    public void printPurchases() {
        if (purchases.isEmpty()) {
            System.out.println("Покупатель " + name + " ничего не купил");
        } else {
            BigDecimal totalPrice = BigDecimal.ZERO;
            System.out.println("Список покупок для " + name + ":");
            double totalWeight = 0.0;
            for (Fruit fruit : purchases) {
                BigDecimal fruitPrice = fruit.getPrice().multiply(BigDecimal.valueOf(fruit.getWeight()));
                System.out.println(fruit.getName() + " - " +
                        fruit.getWeight() +
                        " кг, " +
                        fruit.getFreshness().toString() + " " +
                        fruitPrice.setScale(2, RoundingMode.HALF_UP) + "$");
                totalWeight += fruit.getWeight();
                totalPrice = totalPrice.add(fruitPrice);
            }
            System.out.println("Общий вес покупок " + ": " + totalWeight + " кг");
            System.out.println("Общая стоимость: " + totalPrice.setScale(2, RoundingMode.HALF_UP) + "$");
        }
        System.out.println();
    }
}