package builder;

import abstractfactory.IChair;
import abstractfactory.ICoffeeTable;
import abstractfactory.ISofa;

public class FurnitureSet {
    private IChair chair;
    private ISofa sofa;
    private ICoffeeTable coffeeTable;

    public FurnitureSet(IChair chair, ISofa sofa, ICoffeeTable coffeeTable) {
        this.chair = chair;
        this.sofa = sofa;
        this.coffeeTable = coffeeTable;
    }

    public void displaySet() {
        chair.displayStyle();
        sofa.displayStyle();
        coffeeTable.displayStyle();
    }
}
