Factory Method design pattern

(Just make separate concrete factories instead of a single factory class like in Simple Factory Pattern)

1. We want to move the object creation logic from our code to a separate class
2. We use this pattern when we do not know in advance which class we may need to instantiate beforehand and also to allow new classes to be added to the system and handle their creation without affecting client code
3. The Factory Method pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created
4. We let subclasses decide which object to be instantiated by overriding the factory method


Problems with Simple Factory Pattern:
1. **Tight Coupling**: The client class Client directly instantiates the concrete classes based on the input type provided during its construction. This leads to tight coupling between the client and the concrete classes, making the code difficult to maintain and extend.
2. **Violation of Single Responsibility Principle (SRP)**: The Client class is responsible not only for determining which type of object to instantiate based on the input type but also for managing the lifecycle of the object (e.g., cleanup). This violates the Single Responsibility Principle, which states that a class should have only one reason to change.
3. **Limited Scalability**: Adding a new type of object (Pizza) requires modifying the Client class, which violates the Open-Closed Principle. This design is not scalable because it cannot accommodate new types of vehicles without modifying existing code.

Use cases of Factory Method Pattern:
1. **Framework Design**: The Factory Method pattern is commonly used in frameworks to allow subclasses to provide their own implementation of a method. For example, the Java Collections Framework uses the Factory Method pattern to create instances of List, Set, and Map interfaces.
2. **Dependency Injection**: The Factory Method pattern is used in Dependency Injection frameworks to create instances of classes based on their dependencies. For example, Spring Framework uses the Factory Method pattern to create instances of beans based on their configuration.
3. **Testing**: The Factory Method pattern is used in testing frameworks to create instances of test cases based on their configuration. For example, JUnit uses the Factory Method pattern to create instances of test cases based on their annotations.
4. **Plugin Architecture**: The Factory Method pattern is used in plugin architectures to create instances of plugins based on their configuration. For example, Eclipse uses the Factory Method pattern to create instances of plugins based on their extension points.
5. **JDBC API**: DBC (Java Database Connectivity) uses factories extensively for creating connections, statements, and result sets. Dependency injection frameworks like Spring and Guice rely heavily on factories to create and manage beans.