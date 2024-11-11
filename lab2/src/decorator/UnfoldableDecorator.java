package decorator;

import bridge.IFurnitureType;

public class UnfoldableDecorator extends SofaDecorator {
    public UnfoldableDecorator(IFurnitureType decoratedFurniture) {
        super(decoratedFurniture);
    }

    @Override
    public void display() {
        decoratedFurniture.display();
        System.out.println("  -> Unfoldable");
    }
}