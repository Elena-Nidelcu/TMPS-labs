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

* Bridge Pattern: The Bridge Pattern separates an abstraction (furniture types, like Chair, Sofa, CoffeeTable) from its implementation (furniture styles, like Modern, Victorian, ArtDeco), allowing the two to vary independently. This separation makes it easy to add new furniture types or styles without modifying existing code, enhancing flexibility. By defining interfaces for both types and styles and connecting them only through composition, the pattern reduces dependencies and makes the structure more adaptable.

* Facade Pattern: The Facade Pattern provides a simplified interface to a complex subsystem, making it easier for clients to use. In this project, the FurnitureStoreFacade class unifies the interaction with the factory, builder, and prototype subsystems, allowing the client to create complete furniture sets with minimal interaction. This pattern hides the complexity of subsystem details from the user, offering a more intuitive interface while also helping to manage dependencies between subsystems.

* Decorator Pattern: The Decorator Pattern dynamically adds behavior or functionality to an object without altering its core structure. In this project, decorators were used to extend the features of ISofa objects with additional options like luggage storage or unfoldable functionality. Each decorator wraps the original sofa object, preserving its basic behavior while adding new functionality. This pattern allows for flexible, runtime enhancements without the need to create multiple subclasses for each feature combination, making the system more versatile.

[//]: # (* Snippets from your files.)

[//]: # ()
[//]: # (```)

[//]: # (public void main&#40;&#41; {)

[//]: # ()
[//]: # (})

[//]: # (```)



## Conclusions / Screenshots / Results
The furniture shop simulator project provided valuable insights into the application of structural design patterns, such as Bridge, Facade, and Decorator, in a practical context. Implementing the Bridge pattern allowed for a clear separation between furniture types and styles, enhancing flexibility for future extensions. The Facade pattern simplified the system's complexity by creating a straightforward interface for interacting with various factories, builders, and prototypes, making the code easier to use and understand. The Decorator pattern enabled us to add optional features to furniture dynamically, particularly for sofas, without modifying the original classes.