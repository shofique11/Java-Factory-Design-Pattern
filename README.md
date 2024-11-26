# Java-Factory-Design-Pattern
The Factory Method Design Pattern is a creational design pattern used in software development.
It provides an interface for creating objects in a superclass while allowing subclasses to specify
the types of objects they create.
1. This pattern simplifies the object creation process by placing it in a dedicated method, 
promoting loose coupling between the object creator and the objects themselves.
2. This approach enhances flexibility, extensibility, and maintainability,
enabling subclasses to implement their own factory methods for creating specific object types.

Creator: This is an abstract class or an interface that declares the factory method. 
The creator typically contains a method that serves as a factory for creating objects. 
It may also contain other methods that work with the created objects.
Concrete Creator: Concrete Creator classes are subclasses of the Creator
that implement the factory method to create specific types of objects.
Each Concrete Creator is responsible for creating a particular product.
Product: This is the interface or abstract class for the objects that the factory method creates.
The Product defines the common interface for all objects that the factory method can create.
Concrete Product: Concrete Product classes are the actual objects that the factory method creates.
Each Concrete Product class implements the Product interface or extends the Product abstract class.
