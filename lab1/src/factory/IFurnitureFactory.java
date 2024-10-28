package factory;

import abstractfactory.IChair;
import abstractfactory.ICoffeeTable;
import abstractfactory.ISofa;

public interface IFurnitureFactory {
    IChair createChair();
    ISofa createSofa();
    ICoffeeTable createCoffeeTable();
}
