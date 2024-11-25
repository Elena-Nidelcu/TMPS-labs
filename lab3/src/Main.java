// Structural Patterns and Observer Implementation for Bridge.Furniture Shop
import Bridge.*;
import Facade.*;
import Observer.*;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create Styles
        IFurnitureStyle modern = new ModernStyle();
        IFurnitureStyle victorian = new VictorianStyle();

        // Create Bridge.Furniture
        IFurnitureType modernChair = new Chair(modern);
        IFurnitureType victorianSofa = new Sofa(victorian);

        // Create Shop Facade
        FurnitureShopFacade shopFacade = new FurnitureShopFacade();

        // Register Observers
        shopFacade.registerCustomer(new Customer("Alice"));
        shopFacade.registerAdmin(new Admin("Bob"));

        // Add Bridge.Furniture with Notifications
        shopFacade.addFurnitureWithNotification(modernChair);
        shopFacade.applyDiscountWithNotification(victorianSofa);
    }
}
