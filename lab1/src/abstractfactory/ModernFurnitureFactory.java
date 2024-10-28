package abstractfactory;

import factory.IFurnitureFactory;
import models.ModernChair;
import models.ModernCoffeeTable;
import models.ModernSofa;

public class ModernFurnitureFactory implements IFurnitureFactory {
    public IChair createChair() { return new ModernChair(); }
    public ISofa createSofa() { return new ModernSofa(); }
    public ICoffeeTable createCoffeeTable() { return new ModernCoffeeTable(); }
}