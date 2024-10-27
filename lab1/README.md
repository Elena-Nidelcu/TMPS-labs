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

* The Factory Pattern is utilized in the SimpleFurnitureFactory class, which is responsible for creating individual furniture items like chairs, sofas, and coffee tables without exposing the instantiation logic to the client. This encapsulation allows for easier modifications and extensions in the future without altering existing code.
* The Abstract Factory Pattern is represented by the furniture factories, such as ModernFurnitureFactory, which provide an interface for creating families of related or dependent objects (e.g., modern chairs, sofas, and coffee tables). This pattern allows the client to work with various styles of furniture without needing to know the specific classes being instantiated, ensuring consistent product families.
* The Builder Pattern is implemented in the FurnitureSetBuilder class, which constructs complex furniture sets by aggregating different furniture pieces (chair, sofa, and coffee table). This pattern promotes a step-by-step construction process, enabling clients to create specific configurations of furniture sets with ease while keeping the construction logic separate from the representation.
* The Prototype Pattern is exemplified by the PrototypeChair class, which allows for cloning existing furniture objects. By implementing the clone() method, this pattern enables the creation of new instances based on existing ones, facilitating efficient object creation and the ability to modify prototypes as needed without impacting their original states.


[//]: # (* Snippets from your files.)

[//]: # ()
[//]: # (```)

[//]: # (public void main&#40;&#41; {)

[//]: # ()
[//]: # (})

[//]: # (```)

[//]: # (* If needed, screenshots.)


## Conclusions
In this project, I chose to create a furniture shop simulator to learn about Creational Design Patterns. By implementing the Factory, Abstract Factory, Builder, and Prototype patterns, I gained a practical understanding of how these patterns help in managing object creation and enhancing code flexibility. This experience has significantly improved my grasp of Creational Design Patterns.