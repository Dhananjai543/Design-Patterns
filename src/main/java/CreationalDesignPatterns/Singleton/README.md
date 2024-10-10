# Singleton Design Pattern

1. While developing software applications, sometimes we need to ensure that a class has only one instance and that instance is easily accessible from anywhere in our application. This is where the Singleton Design Pattern roles comes to the rescue. 
2. Any state you add in your singleton becomes part of "global state" of your application.

Steps:
1. Make a constructor private.
2. Write a static method that has the return type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method.

### When to use Singleton Design Pattern?
1. When you want to have only one instance of a class throughout the application.

### Example
1. Logger classes.
2. Configuration classes.
3. Accessing resources in shared mode.
4. Factories implemented as Singletons.
5. Database connections.