### Prototype Design Pattern

1. We have a complex object that is costly to create. To create more instances of such class, we use an existing instance of our prototype.
2. Prototype will allow us to make copies of existing object and save us from having to recreate objects from scratch.
3. Creating a clone can be faster than creating an object from scratch, especially when the initialization process is resource-intensive.

When not to use the Prototype Design Pattern 
1. **Unique Object Instances**:
   Avoid using the Prototype pattern when your application predominantly deals with unique object instances
2. **Simple Object Creation**:
   If object creation is simple and does not involve significant resource consumption, and there are no variations of objects
3. **Immutable Objects**:
   If the objects in your application are immutable, then there is no need to create copies of them.