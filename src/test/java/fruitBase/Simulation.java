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
        boolean exportFlag = false;
        boolean importFlag = false;

        for (String arg : args) {
            if (arg.equals("-e") || arg.equals("--export")) {
                exportFlag = true;
            } else if (arg.equals("-i") || arg.equals("--import")) {
                importFlag = true;
            }
        }

        if (exportFlag) {
            fruitBase.exportCatalogue();
            return;
        }

        if (importFlag) {
            fruitBase.importCatalogue();
            return;
        }
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

