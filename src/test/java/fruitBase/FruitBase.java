package fruitBase;

import fruitBase.fruits.*;
import fruitBase.fruits.Freshness;
import fruitBase.fruits.Fruit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FruitBase {
    private List<Fruit> fruits;

    public FruitBase() {
        fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void addFruit(String fruitName) {
        Fruit fruit = createFruit(fruitName);
        if (fruit != null) {
            fruits.add(fruit);
        }
    }

    public Fruit createFruit(String fruitName) {
        switch (fruitName.toLowerCase()) {
            case "apple":
                return new Apple(0.1, 1.3, Freshness.values()[new Random().nextInt(Freshness.values().length)]);
            case "orange":
                return new Orange(0.2, 2.5, Freshness.values()[new Random().nextInt(Freshness.values().length)]);
            case "banana":
                return new Banana(0.15, 1.8);
            case "mango":
                return new Mango(0.25, 3.5, Freshness.values()[new Random().nextInt(Freshness.values().length)]);
            case "pineapple":
                return new Pineapple(1.5, 7.0, Freshness.values()[new Random().nextInt(Freshness.values().length)]);
            default:
                System.out.println("Неизвестный фрукт: " + fruitName);
                return null;
        }
    }

    public List<Fruit> getAllFruits() {
        return fruits;
    }

    public void exportCatalogue() {
        try {
            FileOutputStream fileOut = new FileOutputStream("fruitCatalogue.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(fruits);
            out.close();
            fileOut.close();
            System.out.println("Каталог экспортирован.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importCatalogue() {
        try {
            FileInputStream fileIn = new FileInputStream("fruitCatalogue.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            fruits = (List<Fruit>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Каталог импортирован.");
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
