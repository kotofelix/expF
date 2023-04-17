package fruitBase;

import fruitBase.customers.*;
import fruitBase.fruits.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Simulation {
    public static void simulateShoppingSession(List<Customer> customers, Cargo cargo) {
        System.out.println("Наличие фруктов: ");
        cargo.printContents();
        System.out.println();
        for (Customer customer : customers) {
            customer.takeFruits(cargo);
            customer.printPurchases();
        }
        System.out.println("Наличие фруктов после покупок: ");
        cargo.printContents();
    }

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();
        FruitCatalogue fruitCatalogue = new FruitCatalogue();
        for (String fruitName : args) {
            Fruit fruit = fruitBase.createFruit(fruitName);
            if (fruit != null) {
                fruitCatalogue.addFruit(fruit);
            }
        }

        Cargo cargo = new Cargo(fruitCatalogue.fruits);

        List<Customer> customers = new ArrayList<>();
        customers.add(new FreshCustomer("Fresh"));
        customers.add(new UniqueCustomer("Unique"));

        simulateShoppingSession(customers, cargo);
    }
}

