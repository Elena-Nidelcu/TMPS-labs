// Main.java
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


// IFurniture Interface
interface IFurniture {
    void displayType();
}

// Concrete Furniture Classes for Factory Pattern
class SimpleChair implements IFurniture {
    @Override
    public void displayType() {
        System.out.println("This is a Chair.");
    }
}

class SimpleSofa implements IFurniture {
    @Override
    public void displayType() {
        System.out.println("This is a Sofa.");
    }
}

class SimpleCoffeeTable implements IFurniture {
    @Override
    public void displayType() {
        System.out.println("This is a CoffeeTable.");
    }
}

// Factory to create individual furniture items
class SimpleFurnitureFactory {
    public IFurniture createFurniture(String type) {
        switch (type) {
            case "Chair": return new SimpleChair();
            case "Sofa": return new SimpleSofa();
            case "CoffeeTable": return new SimpleCoffeeTable();
            default: throw new IllegalArgumentException("Unknown furniture type.");
        }
    }
}

// Abstract Factory Interfaces for Product Family
interface IChair {
    void displayStyle();
}

interface ISofa {
    void displayStyle();
}

interface ICoffeeTable {
    void displayStyle();
}

// Concrete Classes for Different Furniture Variants
// Modern Furniture
class ModernChair implements IChair {
    public void displayStyle() { System.out.println("Modern Chair."); }
}
class ModernSofa implements ISofa {
    public void displayStyle() { System.out.println("Modern Sofa."); }
}
class ModernCoffeeTable implements ICoffeeTable {
    public void displayStyle() { System.out.println("Modern CoffeeTable."); }
}

// Victorian Furniture
class VictorianChair implements IChair {
    public void displayStyle() { System.out.println("Victorian Chair."); }
}
class VictorianSofa implements ISofa {
    public void displayStyle() { System.out.println("Victorian Sofa."); }
}
class VictorianCoffeeTable implements ICoffeeTable {
    public void displayStyle() { System.out.println("Victorian CoffeeTable."); }
}

// ArtDeco Furniture
class ArtDecoChair implements IChair {
    public void displayStyle() { System.out.println("ArtDeco Chair."); }
}
class ArtDecoSofa implements ISofa {
    public void displayStyle() { System.out.println("ArtDeco Sofa."); }
}
class ArtDecoCoffeeTable implements ICoffeeTable {
    public void displayStyle() { System.out.println("ArtDeco CoffeeTable."); }
}

// Abstract Factory Interface
interface IFurnitureFactory {
    IChair createChair();
    ISofa createSofa();
    ICoffeeTable createCoffeeTable();
}

// Concrete Factories for each Furniture Style
class ModernFurnitureFactory implements IFurnitureFactory {
    public IChair createChair() { return new ModernChair(); }
    public ISofa createSofa() { return new ModernSofa(); }
    public ICoffeeTable createCoffeeTable() { return new ModernCoffeeTable(); }
}

class VictorianFurnitureFactory implements IFurnitureFactory {
    public IChair createChair() { return new VictorianChair(); }
    public ISofa createSofa() { return new VictorianSofa(); }
    public ICoffeeTable createCoffeeTable() { return new VictorianCoffeeTable(); }
}

class ArtDecoFurnitureFactory implements IFurnitureFactory {
    public IChair createChair() { return new ArtDecoChair(); }
    public ISofa createSofa() { return new ArtDecoSofa(); }
    public ICoffeeTable createCoffeeTable() { return new ArtDecoCoffeeTable(); }
}

// Builder Pattern: Building Complex Furniture Sets
class FurnitureSet {
    private IChair chair;
    private ISofa sofa;
    private ICoffeeTable coffeeTable;

    public FurnitureSet(IChair chair, ISofa sofa, ICoffeeTable coffeeTable) {
        this.chair = chair;
        this.sofa = sofa;
        this.coffeeTable = coffeeTable;
    }

    public void displaySet() {
        chair.displayStyle();
        sofa.displayStyle();
        coffeeTable.displayStyle();
    }
}

class FurnitureSetBuilder {
    private IChair chair;
    private ISofa sofa;
    private ICoffeeTable coffeeTable;

    public FurnitureSetBuilder setChair(IChair chair) {
        this.chair = chair;
        return this;
    }

    public FurnitureSetBuilder setSofa(ISofa sofa) {
        this.sofa = sofa;
        return this;
    }

    public FurnitureSetBuilder setCoffeeTable(ICoffeeTable coffeeTable) {
        this.coffeeTable = coffeeTable;
        return this;
    }

    public FurnitureSet build() {
        return new FurnitureSet(chair, sofa, coffeeTable);
    }
}

// Prototype Pattern: Cloning Furniture
abstract class FurniturePrototype implements Cloneable {
    public abstract FurniturePrototype clone();
}

class PrototypeChair extends ModernChair implements Cloneable {
    public PrototypeChair() { super(); }

    @Override
    public PrototypeChair clone() {
        return new PrototypeChair();
    }
}
