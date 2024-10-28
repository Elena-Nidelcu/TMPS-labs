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

* I used the Factory method by creating an interface for creating objects, IFurnitureFactory, and a SimpleFurnitureFactory class, which is responsible for creating individual furniture items like chairs, sofas, and coffee tables without exposing the instantiation logic to the client. This encapsulation allows for easier modifications and extensions in the future, if I will add another class, without altering existing code.
* The Abstract Factory Pattern is represented by the family of furniture factories, such as ModernFurnitureFactory, SimpleFurnitureFactory, VictorianFurnitureFactory which provide an interface for creating families of related or dependent objects (e.g., modern chairs, sofas, and coffee tables). This pattern allows the client to work with various styles of furniture without needing to know the specific classes being instantiated, ensuring consistent product families.
* The Builder Pattern is implemented in the FurnitureSetBuilder class, which constructs complex furniture sets by aggregating different furniture pieces (chair, sofa, and coffee table) using the same construction code. This pattern promotes a step-by-step construction process, enabling clients to create specific configurations of furniture sets with ease while keeping the construction logic separate from the representation.
* The Prototype Pattern is exemplified by the PrototypeChair class, which allows me cloning an existing chair. By implementing the clone() method, this pattern enables the creation of new instances based on existing ones, facilitating efficient object creation and the ability to modify prototypes as needed.


[//]: # (* Snippets from your files.)

[//]: # ()
[//]: # (```)

[//]: # (public void main&#40;&#41; {)

[//]: # ()
[//]: # (})

[//]: # (```)

[//]: # (* If needed, screenshots.)


## Conclusions
In this project, I chose to create a furniture shop simulator to learn about Creational Design Patterns. By implementing the Factory, Abstract Factory, Builder, and Prototype patterns, I gained a practical understanding of how these patterns help in managing object creation and enhancing code flexibility. This experience has significantly improved my knowledge of Creational Design Patterns.

## References
https://refactoring.guru/design-patterns/creational-patterns