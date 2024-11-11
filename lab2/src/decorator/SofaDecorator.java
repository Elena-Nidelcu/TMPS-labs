package decorator;

import bridge.IFurnitureType;

public abstract class SofaDecorator implements IFurnitureType {
    protected IFurnitureType decoratedFurniture;

    public SofaDecorator(IFurnitureType decoratedFurniture) {
        this.decoratedFurniture = decoratedFurniture;
    }

    public void display() {
        decoratedFurniture.display();
    }
}