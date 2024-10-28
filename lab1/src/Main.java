// Main.java

import models.*;
import factory.*;
import abstractfactory.*;
import builder.*;
import prototype.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== Factory Pattern ======");
        System.out.println("Here we create individual furniture items (Chair, Sofa, CoffeeTable) using SimpleFurnitureFactory.");
        SimpleFurnitureFactory simpleFactory = new SimpleFurnitureFactory();
        IFurniture chair = simpleFactory.createFurniture("Chair");
        chair.displayType(); // Output: "This is a Chair."

        System.out.println("\n====== Abstract Factory Pattern ======");
        System.out.println("Here we create a family of related furniture items (Modern Chair, Sofa, and CoffeeTable) using ModernFurnitureFactory.");
        IFurnitureFactory modernFactory = new ModernFurnitureFactory();
        IChair modernChair = modernFactory.createChair();
        modernChair.displayStyle(); // Output: "Modern Chair."

        System.out.println("\n====== Builder Pattern ======");
        System.out.println("Here we build a complete set of furniture using FurnitureSetBuilder, combining Chair, Sofa, and CoffeeTable.");
        FurnitureSetBuilder setBuilder = new FurnitureSetBuilder();
        FurnitureSet modernSet = setBuilder.setChair(modernFactory.createChair())
                .setSofa(modernFactory.createSofa())
                .setCoffeeTable(modernFactory.createCoffeeTable())
                .build();
        modernSet.displaySet(); // Output: "Modern Chair", "Modern Sofa", "Modern CoffeeTable"

        System.out.println("\n====== Prototype Pattern ======");
        System.out.println("Here we create a copy of an existing furniture item (PrototypeChair) using cloning.");
        PrototypeChair prototypeChair = new PrototypeChair();
        PrototypeChair clonedChair = prototypeChair.clone();
        clonedChair.displayStyle(); // Output: "Modern Chair."
    }
}