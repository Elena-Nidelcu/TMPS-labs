package decorator;

import bridge.IFurnitureType;

public class LuggageCompartmentDecorator extends SofaDecorator {
    public LuggageCompartmentDecorator(IFurnitureType decoratedFurniture) {
        super(decoratedFurniture);
    }

    @Override
    public void display() {
        decoratedFurniture.display();
        System.out.println("  -> with Luggage Compartment");
    }
}
