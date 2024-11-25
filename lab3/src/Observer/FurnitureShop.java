package Observer;

import Bridge.IFurnitureType;

import java.util.ArrayList;
import java.util.List;

// Observer Pattern Implementation
public class FurnitureShop implements ISubject {
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
        System.out.println("New Bridge.Furniture Added:");
        furniture.displayType();
        notifyObservers("New furniture added: " + furniture.getClass().getSimpleName());
    }

    public void applyDiscount(IFurnitureType furniture) {
        System.out.println("Discount Applied:");
        furniture.displayType();
        notifyObservers("Discount on furniture: " + furniture.getClass().getSimpleName());
    }
}
