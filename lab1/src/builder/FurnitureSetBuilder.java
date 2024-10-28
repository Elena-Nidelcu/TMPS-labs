package builder;

import abstractfactory.IChair;
import abstractfactory.ICoffeeTable;
import abstractfactory.ISofa;

public class FurnitureSetBuilder {
    private IChair chair;
    private ISofa sofa;
    private ICoffeeTable coffeeTable;

    public FurnitureSetBuilder setChair(IChair chair) {
        this.chair = chair;
        return this;
    }

    public FurnitureSetBuilder setSofa(ISofa sofa) {
        this.sofa = sofa;
        return this;
    }

    public FurnitureSetBuilder setCoffeeTable(ICoffeeTable coffeeTable) {
        this.coffeeTable = coffeeTable;
        return this;
    }

    public FurnitureSet build() {
        return new FurnitureSet(chair, sofa, coffeeTable);
    }
}
