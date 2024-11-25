package Bridge;

public class Sofa extends Furniture {
    public Sofa(IFurnitureStyle style) {
        super(style);
    }

    @Override
    public void displayType() {
        System.out.println("Bridge.Furniture Type: Sofa");
    }

    @Override
    public void displayDetails() {
        displayType();
        style.displayStyle();
    }
}
