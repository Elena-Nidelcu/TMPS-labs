// Structural Patterns and Observer Implementation for Furniture Shop

import java.util.ArrayList;
import java.util.List;

// Interfaces
interface IFurnitureType {
    void displayType();
}

interface IFurnitureStyle {
    void displayStyle();
}

// Observer Pattern Interfaces
interface IObserver {
    void update(String message);
}

interface ISubject {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String message);
}

// Bridge Pattern: Abstraction
abstract class Furniture implements IFurnitureType {
    protected IFurnitureStyle style;

    public Furniture(IFurnitureStyle style) {
        this.style = style;
    }

    public abstract void displayDetails();
}

// Concrete Implementations for Furniture Types
class Chair extends Furniture {
    public Chair(IFurnitureStyle style) {
        super(style);
    }

    @Override
    public void displayType() {
        System.out.println("Furniture Type: Chair");
    }

    @Override
    public void displayDetails() {
        displayType();
        style.displayStyle();
    }
}

class Sofa extends Furniture {
    public Sofa(IFurnitureStyle style) {
        super(style);
    }

    @Override
    public void displayType() {
        System.out.println("Furniture Type: Sofa");
    }

    @Override
    public void displayDetails() {
        displayType();
        style.displayStyle();
    }
}

class CoffeeTable extends Furniture {
    public CoffeeTable(IFurnitureStyle style) {
        super(style);
    }

    @Override
    public void displayType() {
        System.out.println("Furniture Type: Coffee Table");
    }

    @Override
    public void displayDetails() {
        displayType();
        style.displayStyle();
    }
}

// Concrete Implementations for Furniture Styles
class ModernStyle implements IFurnitureStyle {
    @Override
    public void displayStyle() {
        System.out.println("Furniture Style: Modern");
    }
}

class VictorianStyle implements IFurnitureStyle {
    @Override
    public void displayStyle() {
        System.out.println("Furniture Style: Victorian");
    }
}

class ArtDecoStyle implements IFurnitureStyle {
    @Override
    public void displayStyle() {
        System.out.println("Furniture Style: Art Deco");
    }
}

// Observer Pattern Implementation
class FurnitureShop implements ISubject {
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }

    public void addNewFurniture(IFurnitureType furniture) {
        System.out.println("New Furniture Added:");
        furniture.displayType();
        notifyObservers("New furniture added: " + furniture.getClass().getSimpleName());
    }

    public void applyDiscount(IFurnitureType furniture) {
        System.out.println("Discount Applied:");
        furniture.displayType();
        notifyObservers("Discount on furniture: " + furniture.getClass().getSimpleName());
    }
}

class Customer implements IObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

class Admin implements IObserver {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Admin " + name + " received notification: " + message);
    }
}

// Facade Pattern Implementation
class FurnitureShopFacade {
    private FurnitureShop shop = new FurnitureShop();

    public void registerCustomer(IObserver customer) {
        shop.addObserver(customer);
    }

    public void registerAdmin(IObserver admin) {
        shop.addObserver(admin);
    }

    public void addFurnitureWithNotification(IFurnitureType furniture) {
        shop.addNewFurniture(furniture);
    }

    public void applyDiscountWithNotification(IFurnitureType furniture) {
        shop.applyDiscount(furniture);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create Styles
        IFurnitureStyle modern = new ModernStyle();
        IFurnitureStyle victorian = new VictorianStyle();

        // Create Furniture
        IFurnitureType modernChair = new Chair(modern);
        IFurnitureType victorianSofa = new Sofa(victorian);

        // Create Shop Facade
        FurnitureShopFacade shopFacade = new FurnitureShopFacade();

        // Register Observers
        shopFacade.registerCustomer(new Customer("Alice"));
        shopFacade.registerAdmin(new Admin("Bob"));

        // Add Furniture with Notifications
        shopFacade.addFurnitureWithNotification(modernChair);
        shopFacade.applyDiscountWithNotification(victorianSofa);
    }
}
