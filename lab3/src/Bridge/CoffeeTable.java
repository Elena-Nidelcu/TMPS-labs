package Bridge;

class CoffeeTable extends Furniture {
    public CoffeeTable(IFurnitureStyle style) {
        super(style);
    }

    @Override
    public void displayType() {
        System.out.println("Bridge.Furniture Type: Coffee Table");
    }

    @Override
    public void displayDetails() {
        displayType();
        style.displayStyle();
    }
}
