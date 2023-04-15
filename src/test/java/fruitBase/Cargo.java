package fruitBase;

import fruitBase.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Cargo {
    private List<Fruit> fruits;
    private double totalWeight;

    public Cargo(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public Fruit removeFruit(Fruit fruit) {
        if (!fruits.contains(fruit)) {
            return null;
        }
        fruits.remove(fruit);
        return fruit;
    }

    public void printContents() {
        if (fruits.isEmpty()) {
            System.out.println("Фрукты закончились");
        } else {
            double totalWeight = 0;
            for (Fruit fruit : fruits) {
                System.out.println(fruit.getName() + " - "
                        + "цена: " + fruit.getPrice() + "$\\кг, "
                        + fruit.getFreshness().toString()
                        + ", вес: " + fruit.getWeight() + " кг.");
                totalWeight += fruit.getTotalWeight();
            }
            System.out.println("Общий вес фруктов: " + totalWeight + " кг.");
        }
    }

    public List<Fruit> takeFruits(List<Fruit> selectedFruits) {
        List<Fruit> purchasedFruits = new ArrayList<>();
        for (Fruit fruit : selectedFruits) {
            if (fruits.contains(fruit)) {
                purchasedFruits.add(fruit);
                fruits.remove(fruit);
            }
        }
        return purchasedFruits;
    }
}
