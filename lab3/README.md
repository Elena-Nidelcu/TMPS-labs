# Behavioral Design Patterns


## Author: Nidelcu Elena

----

## Objectives:

* Study and understand the Behavioral Design Patterns;
* As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system;
* Implement some additional functionalities using behavioral design patterns;


## Used Design Patterns:

* Observer


## Implementation

* I used the Observer Pattern to implement a notification system for the furniture shop. It defines a subscription mechanism and notifies the customers if the shop adds new furniture or applies discounts. This pattern helps keeping customers informed about updates. To implement this pattern I created interfaces for observer and subject and classes for Admin, Customer and FurnitureShop.
```
public void addNewFurniture(IFurnitureType furniture) {
    System.out.println("New Bridge.Furniture Added:");
    furniture.displayType();
    notifyObservers("New furniture added: " + furniture.getClass().getSimpleName());
}

public void applyDiscount(IFurnitureType furniture) {
    System.out.println("Discount Applied:");
    furniture.displayType();
    notifyObservers("Discount on furniture: " + furniture.getClass().getSimpleName());
}
```


## Conclusions / Screenshots / Results
I continued my project with a furniture shop simulator to learn about Behavioral Design Patterns. Here I integrated the observer design pattern along with the structural design patterns to create subscribing and notifying furniture shop management system. The incorporation of the Observer Pattern introduces this notification mechanism to keep users informed about important updates in real-time. This experience has significantly improved my knowledge of Behavioral Design Patterns.

## References
https://refactoring.guru/design-patterns/behavioral-patterns