package facade;

import bridge.*;

import java.util.ArrayList;
import java.util.List;

public class FurnitureStoreFacade {
    public List<IFurnitureType> orderModernSet() {
        List<IFurnitureType> furnitureSet = new ArrayList<>();
        furnitureSet.add(new Chair(new ModernStyle()));
        furnitureSet.add(new Sofa(new ModernStyle()));
        furnitureSet.add(new CoffeeTable(new ModernStyle()));
        return furnitureSet;
    }

    public List<IFurnitureType> orderVictorianSet() {
        List<IFurnitureType> furnitureSet = new ArrayList<>();
        furnitureSet.add(new Chair(new VictorianStyle()));
        furnitureSet.add(new Sofa(new VictorianStyle()));
        furnitureSet.add(new CoffeeTable(new VictorianStyle()));
        return furnitureSet;
    }

    public List<IFurnitureType> orderArtDecoSet() {
        List<IFurnitureType> furnitureSet = new ArrayList<>();
        furnitureSet.add(new Chair(new ArtDecoStyle()));
        furnitureSet.add(new Sofa(new ArtDecoStyle()));
        furnitureSet.add(new CoffeeTable(new ArtDecoStyle()));
        return furnitureSet;
    }
}