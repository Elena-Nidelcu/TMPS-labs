// Import Statements
import java.util.List;
import bridge.*;
import decorator.*;
import facade.*;

// Main class to test everything together
public class Main {
    public static void main(String[] args) {
        FurnitureStoreFacade store = new FurnitureStoreFacade();

        // Order and display Modern Furniture Set
        System.out.println("====== Modern Furniture Set ======");
        List<IFurnitureType> modernSet = store.orderModernSet();
        for (IFurnitureType furniture : modernSet) {
            furniture.display();
        }

        // Decorate a Modern Sofa with extra features
        System.out.println("\n====== Decorated Modern Sofa ======");
        IFurnitureType modernSofa = new Sofa(new ModernStyle());
        IFurnitureType decoratedSofa = new HeatedSeatsDecorator(new UnfoldableDecorator(modernSofa));
        decoratedSofa.display();

        // Order and display Victorian Furniture Set
        System.out.println("\n====== Victorian Furniture Set ======");
        List<IFurnitureType> victorianSet = store.orderVictorianSet();
        for (IFurnitureType furniture : victorianSet) {
            furniture.display();
        }

        // Order and display ArtDeco Furniture Set
        System.out.println("\n====== ArtDeco Furniture Set ======");
        List<IFurnitureType> artDecoSet = store.orderArtDecoSet();
        for (IFurnitureType furniture : artDecoSet) {
            furniture.display();
        }
    }
}
