package bridge;

public class Chair implements IFurnitureType {
    private IFurnitureStyle style;

    public Chair(IFurnitureStyle style) {
        this.style = style;
    }

    @Override
    public void display() {
        System.out.println(style.getStyle() + " Chair");
    }
}