# Creational Design Patterns


## Author: Nidelcu Elena

----

## Objectives:

* Get familiar with the Creational DPs;
* Choose a specific domain;
* Implement at least 3 CDPs for the specific domain;


## Used Design Patterns:

* Factory
* Abstract Factory
* Builder
* Prototype


## Implementation

* I used the Factory method by creating an interface for creating objects, IFurnitureFactory, for creating objects in a superclass, and then allows subclasses to alter the type of objects that will be created. I exemplified it by creating a SimpleFurnitureFactory class, which is responsible for creating individual furniture items like chairs, sofas, and coffee tables in simple style. 
```java
public class SimpleFurnitureFactory {
    public IFurniture createFurniture(String type) {
        switch (type) {
            case "Chair": return new SimpleChair();
            case "Sofa": return new SimpleSofa();
            case "CoffeeTable": return new SimpleCoffeeTable();
            default: throw new IllegalArgumentException("Unknown furniture type.");
        }
    }
}
```
This encapsulation allows for easier modifications and extensions in the future, if I will add another style of furniture, without modifying existing styles.
* The Abstract Factory Pattern is used when I represented the families of furniture factories, such as ModernFurnitureFactory, SimpleFurnitureFactory and VictorianFurnitureFactory, which provide an interface for creating families of related objects without specifying their concrete classes (e.g., modern chairs, modern sofas, and modern coffee tables). 
```java
public class ModernFurnitureFactory implements IFurnitureFactory {
    public IChair createChair() { return new ModernChair(); }
    public ISofa createSofa() { return new ModernSofa(); }
    public ICoffeeTable createCoffeeTable() { return new ModernCoffeeTable(); }
}
```
This pattern allows the client to work with various styles of furniture and be sure that the products I'm getting from a factory are compatible with each other.
* The Builder Pattern is implemented in the FurnitureSetBuilder class, which constructs complex furniture sets allows me to produce different types and representations of furniture pieces (chair, sofa, and coffee table) using the same construction code.
```java
    public FurnitureSet build() {
        return new FurnitureSet(chair, sofa, coffeeTable);
    }

```
This pattern promotes a step-by-step construction process, ensuring Single Responsibility Principle, because I can isolate complex configurations of furniture sets from the business logic.
* The Prototype Pattern is exemplified by the PrototypeChair class, which allows me cloning an existing chair. The pattern declares a common abstract class for all objects that support cloning. This class (FurniturePrototype) lets me clone an object without coupling the code to the class of that object. This class contains just a single clone method. 
```java
public abstract class FurniturePrototype implements Cloneable {
    public abstract FurniturePrototype clone();
}

```
By implementing the clone() method, this pattern enables the creation of new furniture item based on existing ones, and the modification of prototypes as needed.

## Conclusions
In this project, I chose to create a furniture shop simulator to learn about Creational Design Patterns. By implementing the Factory, Abstract Factory, Builder, and Prototype patterns, I gained a practical understanding of how these patterns help in managing object creation and enhancing code flexibility. This experience has significantly improved my knowledge of Creational Design Patterns.

## References
https://refactoring.guru/design-patterns/creational-patterns