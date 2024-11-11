package decorator;

import bridge.IFurnitureType;

public class HeatedSeatsDecorator extends SofaDecorator {
    public HeatedSeatsDecorator(IFurnitureType decoratedFurniture) {
        super(decoratedFurniture);
    }

    @Override
    public void display() {
        decoratedFurniture.display();
        System.out.println("  -> with Heated Seats");
    }
}