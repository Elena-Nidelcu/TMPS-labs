package bridge;

public class Sofa implements IFurnitureType {
    private IFurnitureStyle style;

    public Sofa(IFurnitureStyle style) {
        this.style = style;
    }

    @Override
    public void display() {
        System.out.println(style.getStyle() + " Sofa");
    }
}