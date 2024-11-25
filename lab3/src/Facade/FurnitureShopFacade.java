package Facade;

import Bridge.IFurnitureType;
import Observer.*;

// Facade Pattern Implementation
public class FurnitureShopFacade {
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
