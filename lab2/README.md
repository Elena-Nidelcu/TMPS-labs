# Structural Design Patterns


## Author: Nidelcu Elena

----

## Objectives:

* Study and understand the Structural Design Patterns.
* As a continuation of the previous laboratory work, think about the functionalities that your system will need to provide to the user.
* Implement some additional functionalities using structural design patterns.

## Used Design Patterns:

* Bridge
* Decorator
* Facade


## Implementation

* Bridge Pattern: Using this pattern I separated the furniture classes into 2 independent dimensions: by type and by style, because creating every possible combination of furniture type and style will grow exponentially the number of subclasses. This separation makes it easy to add new furniture types or styles without modifying existing code. I defined interfaces for both types and styles. 
```java
public interface IFurnitureStyle {
    String getStyle();
}
public interface IFurnitureType {
    void display();
}
IFurnitureType modernSofa = new Sofa(new ModernStyle());

```
* Facade Pattern: Using this pattern I provided a simplified interface to a new set of furniture. Here I provided simpler methods for creating new full sets of furniture. I created a FurnitureStoreFacade class that provides high-level methods like orderModernFurnitureSet() or orderVictorianSofa(). This pattern hides the complexity of subsystem details from the user.
```java
public List<IFurnitureType> orderModernSet() {
        List<IFurnitureType> furnitureSet = new ArrayList<>();
        furnitureSet.add(new Chair(new ModernStyle()));
        furnitureSet.add(new Sofa(new ModernStyle()));
        furnitureSet.add(new CoffeeTable(new ModernStyle()));
        return furnitureSet;
    }
```
* Decorator Pattern: Using this pattern I attached new behaviors to the sofa by placing these objects inside special wrapper objects that contain the behaviors. If I combined these new behaviors into new inherited classes I would get exponentially growing number of subclasses. I used aggregation to add 3 new "services" to the sofa: possibility to unfold, luggage compartment and heated seats.
```java
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
```
[//]: # (* Snippets from your files.)

[//]: # ()
[//]: # (```)

[//]: # (public void main&#40;&#41; {)

[//]: # ()
[//]: # (})

[//]: # (```)



## Conclusions / Screenshots / Results
I continued my project with a furniture shop simulator to learn about Structural Design Patterns. By implementing the Bridge, Facade, and Decorator, I gained a practical understanding of how these patterns help in a clear separation between furniture types and styles (Bridge), creation of a simpler interface (Facade) and addition of optional features to furniture dynamically (Decorator). This experience has significantly improved my knowledge of Structural Design Patterns.

## References
https://refactoring.guru/design-patterns/structural-patterns