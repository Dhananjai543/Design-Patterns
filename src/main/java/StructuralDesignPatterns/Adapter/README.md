Adapter Design Pattern

1. We have an existing object which provides the functionality that client needs. But client code can't use this object because it expects an object with different interface.
2. Using adapter design pattern we make this existing object work with the client by adapting the object to client's expected interface.
3. This pattern is also called as wrapper as it "wraps" existing object.

Components of Adapter Design Pattern
1. Target Interface
   Description: Defines the interface expected by the client. It represents the set of operations that the client code can use.
   Role: It’s the common interface that the client code interacts with.
2. Adaptee
   Description: The existing class or system with an incompatible interface that needs to be integrated into the new system.
   Role: It’s the class or system that the client code cannot directly use due to interface mismatches.
3. Adapter
   Description: A class that implements the target interface and internally uses an instance of the adaptee to make it compatible with the target interface.
   Role: It acts as a bridge, adapting the interface of the adaptee to match the target interface.
4. Client
   Description: The code that uses the target interface to interact with objects. It remains unaware of the specific implementation details of the adaptee and the adapter.
   Role: It’s the code that benefits from the integration of the adaptee into the system through the adapter.

[
### When to use Adapter Design Pattern?
1. When you want to use an existing class, and its interface does not match the one you need.

### Example
1. When you want to use a third-party library in your application, but its interface does not match the interface you need.
2. When you want to reuse legacy code in your application, but its interface does not match the interface you need.]()

