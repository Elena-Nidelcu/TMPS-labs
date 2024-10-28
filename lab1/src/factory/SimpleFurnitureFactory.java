package factory;

import models.IFurniture;
import models.SimpleChair;
import models.SimpleCoffeeTable;
import models.SimpleSofa;

public class SimpleFurnitureFactory {
    public IFurniture createFurniture(String type) {
        switch (type) {
            case "Chair": return new SimpleChair();
            case "Sofa": return new SimpleSofa();
            case "CoffeeTable": return new SimpleCoffeeTable();
            default: throw new IllegalArgumentException("Unknown furniture type.");
        }
    }
}
