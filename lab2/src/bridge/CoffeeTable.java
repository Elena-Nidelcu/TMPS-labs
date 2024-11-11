package bridge;

public class CoffeeTable implements IFurnitureType {
    private IFurnitureStyle style;

    public CoffeeTable(IFurnitureStyle style) {
        this.style = style;
    }

    @Override
    public void display() {
        System.out.println(style.getStyle() + " Coffee Table");
    }
}