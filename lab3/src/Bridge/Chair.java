package Bridge;

// Concrete Implementations for Bridge.Furniture Types
public class Chair extends Furniture {
    public Chair(IFurnitureStyle style) {
        super(style);
    }

    @Override
    public void displayType() {
        System.out.println("Bridge.Furniture Type: Chair");
    }

    @Override
    public void displayDetails() {
        displayType();
        style.displayStyle();
    }
}
