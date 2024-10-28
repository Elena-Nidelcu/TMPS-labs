package abstractfactory;

import factory.IFurnitureFactory;
import models.ArtDecoChair;
import models.ArtDecoCoffeeTable;
import models.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements IFurnitureFactory {
    public IChair createChair() { return new ArtDecoChair(); }
    public ISofa createSofa() { return new ArtDecoSofa(); }
    public ICoffeeTable createCoffeeTable() { return new ArtDecoCoffeeTable(); }
}
