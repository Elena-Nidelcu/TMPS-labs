package Bridge;

// Bridge Pattern: Abstraction
public abstract class Furniture implements IFurnitureType {
    protected IFurnitureStyle style;

    public Furniture(IFurnitureStyle style) {
        this.style = style;
    }

    public abstract void displayDetails();
}
