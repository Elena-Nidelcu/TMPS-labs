package abstractfactory;

import factory.IFurnitureFactory;
import models.VictorianChair;
import models.VictorianCoffeeTable;
import models.VictorianSofa;

public class VictorianFurnitureFactory implements IFurnitureFactory {
    public IChair createChair() { return new VictorianChair(); }
    public ISofa createSofa() { return new VictorianSofa(); }
    public ICoffeeTable createCoffeeTable() { return new VictorianCoffeeTable(); }
}