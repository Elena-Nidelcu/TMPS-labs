package Bridge;

// Concrete Implementations for Bridge.Furniture Styles
public class ModernStyle implements IFurnitureStyle {
    @Override
    public void displayStyle() {
        System.out.println("Bridge.Furniture Style: Modern");
    }
}
