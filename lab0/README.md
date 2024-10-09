
# Creational Design Patterns


## Author: Nidelcu Elena

----

## Objectives:

* Get familiar with the SOLID principles;
* Choose 2 letters from SOLID;
* Implement 2 SOLID principles choosen in step 2;


## Used SOLID principles:

* SRP
* OCP


## Implementation

* In the SRP I chose the food delivery topic. Consider a food delivery application that takes food orders, calculates the bill, and delivers it to customers. We can have 1 separate class for each of the tasks to be performed, and then the main class can just invoke those classes to get these actions done one after the other. We have a Customer class that has customer attributes like name, address. Order class has all order information like item name, quantity. The BillCalculation class calculates the total bill sets the bill amount in the order object. The DeliveryApp has 1 task of delivering the order to the customer. If the functionality of bill calculation, as well as order delivery, was added in the same class, then that class gets modified whenever the bill calculation logic or the delivery agent logic needs to change; which goes against the Single Responsibility Principle.
  
* In the OCP I chose the calculating the volume of shapes topic. To implement OCP I created an abstract class that serves as a base class for all types of objects.  All the geometric objects have a set of dimensions and a get_volume method.  For each type of object I inherited the ‘Geo_object’ class, add the dimensions for that type of object and override the ‘get_volume‘ method.  As it is apparent that by shifting the volume calculation from the ‘Application’ class to a different class, adding a new type of geometric object would not require changing the ‘Application’ class. The Application class is closed for modification. If we implemented this program as Cuboid and Application classes, if we were to add a new class Sphere, we should change the Application class. Any changes in a code can lead to some unexpected errors in the future–so it is not advisable to change the well-tested code every time requirements change.

[//]: # (```)

[//]: # (public void main&#40;&#41; {)

[//]: # ()
[//]: # (})

[//]: # (```)

## Conclusions / Screenshots / Results
* Applying the SRP ensured each class in the food delivery app focused on one task, making the system more maintainable and reducing the risk of unintended side effects when modifying functionality.

* The OCP in the volume calculation system allowed for new shapes to be added without altering existing code, improving flexibility and minimizing the chances of introducing bugs.

* Both principles resulted in cleaner, more modular code that is easier to extend and maintain.