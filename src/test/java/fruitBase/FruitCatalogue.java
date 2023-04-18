package fruitBase;

import fruitBase.fruits.Fruit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FruitCatalogue implements Serializable {
    protected List<Fruit> fruits;

    public FruitCatalogue() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        this.fruits.add(fruit);
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
