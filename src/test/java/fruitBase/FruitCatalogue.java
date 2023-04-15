package fruitBase;

import fruitBase.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitCatalogue {
    protected List<Fruit> fruits;

    public FruitCatalogue() {
        this.fruits = new ArrayList<>();
    }

    Fruit findFruit(String name) {
        for (Fruit fruit : this.fruits) {
            if (fruit.getName().equalsIgnoreCase(name)) {
                return fruit;
            }
        }
        return null;
    }
}
