// Interfaces
interface IFurniture {
    void displayType();
}

interface IChair extends IFurniture {
    void displayStyle();
}

interface ISofa extends IFurniture {
    void displayStyle();
}

interface ICoffeeTable extends IFurniture {
    void displayStyle();
}

interface IFurnitureFactory {
    IChair createChair();
    ISofa createSofa();
    ICoffeeTable createCoffeeTable();
}

// Furniture Types
class ModernChair implements IChair {
    @Override
    public void displayType() {
        System.out.println("This is a Chair.");
    }

    @Override
    public void displayStyle() {
        System.out.println("Modern Chair.");
    }
}

class VictorianChair implements IChair {
    @Override
    public void displayType() {
        System.out.println("This is a Chair.");
    }

    @Override
    public void displayStyle() {
        System.out.println("Victorian Chair.");
    }
}

class ArtDecoChair implements IChair {
    @Override
    public void displayType() {
        System.out.println("This is a Chair.");
    }

    @Override
    public void displayStyle() {
        System.out.println("ArtDeco Chair.");
    }
}

class ModernSofa implements ISofa {
    @Override
    public void displayType() {
        System.out.println("This is a Sofa.");
    }

    @Override
    public void displayStyle() {
        System.out.println("Modern Sofa.");
    }
}

class VictorianSofa implements ISofa {
    @Override
    public void displayType() {
        System.out.println("This is a Sofa.");
    }

    @Override
    public void displayStyle() {
        System.out.println("Victorian Sofa.");
    }
}

class ArtDecoSofa implements ISofa {
    @Override
    public void displayType() {
        System.out.println("This is a Sofa.");
    }

    @Override
    public void displayStyle() {
        System.out.println("ArtDeco Sofa.");
    }
}

class ModernCoffeeTable implements ICoffeeTable {
    @Override
    public void displayType() {
        System.out.println("This is a Coffee Table.");
    }

    @Override
    public void displayStyle() {
        System.out.println("Modern Coffee Table.");
    }
}

class VictorianCoffeeTable implements ICoffeeTable {
    @Override
    public void displayType() {
        System.out.println("This is a Coffee Table.");
    }

    @Override
    public void displayStyle() {
        System.out.println("Victorian Coffee Table.");
    }
}

class ArtDecoCoffeeTable implements ICoffeeTable {
    @Override
    public void displayType() {
        System.out.println("This is a Coffee Table.");
    }

    @Override
    public void displayStyle() {
        System.out.println("ArtDeco Coffee Table.");
    }
}

// Furniture Factories
class ModernFurnitureFactory implements IFurnitureFactory {
    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ISofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}

class VictorianFurnitureFactory implements IFurnitureFactory {
    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}

class ArtDecoFurnitureFactory implements IFurnitureFactory {
    @Override
    public IChair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public ISofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}

// FurnitureSetBuilder (Builder Pattern)
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

// Prototype Pattern
abstract class FurniturePrototype implements Cloneable {
    public abstract FurniturePrototype clone();
}

class PrototypeChair extends ModernChair implements FurniturePrototype {
    @Override
    public PrototypeChair clone() {
        return new PrototypeChair();
    }
}

// Facade Pattern
class FurnitureStoreFacade {
    private IFurnitureFactory modernFactory = new ModernFurnitureFactory();
    private IFurnitureFactory victorianFactory = new VictorianFurnitureFactory();
    private IFurnitureFactory artDecoFactory = new ArtDecoFurnitureFactory();

    public FurnitureSet orderModernFurnitureSet() {
        System.out.println("Ordering a Modern Furniture Set:");
        return new FurnitureSetBuilder()
                .setChair(modernFactory.createChair())
                .setSofa(modernFactory.createSofa())
                .setCoffeeTable(modernFactory.createCoffeeTable())
                .build();
    }

    public FurnitureSet orderVictorianFurnitureSet() {
        System.out.println("Ordering a Victorian Furniture Set:");
        return new FurnitureSetBuilder()
                .setChair(victorianFactory.createChair())
                .setSofa(victorianFactory.createSofa())
                .setCoffeeTable(victorianFactory.createCoffeeTable())
                .build();
    }

    public FurnitureSet orderArtDecoFurnitureSet() {
        System.out.println("Ordering an ArtDeco Furniture Set:");
        return new FurnitureSetBuilder()
                .setChair(artDecoFactory.createChair())
                .setSofa(artDecoFactory.createSofa())
                .setCoffeeTable(artDecoFactory.createCoffeeTable())
                .build();
    }

    public PrototypeChair cloneModernChair() {
        System.out.println("Cloning a Modern Chair:");
        PrototypeChair prototypeChair = new PrototypeChair();
        return prototypeChair.clone();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        FurnitureStoreFacade storeFacade = new FurnitureStoreFacade();

        // Order a Modern Furniture Set
        System.out.println("====== Order Modern Furniture Set ======");
        FurnitureSet modernSet = storeFacade.orderModernFurnitureSet();
        modernSet.displaySet();

        // Order a Victorian Furniture Set
        System.out.println("\n====== Order Victorian Furniture Set ======");
        FurnitureSet victorianSet = storeFacade.orderVictorianFurnitureSet();
        victorianSet.displaySet();

        // Clone a Modern Chair
        System.out.println("\n====== Clone Modern Chair ======");
        PrototypeChair clonedChair = storeFacade.cloneModernChair();
        clonedChair.displayStyle();
    }
}
