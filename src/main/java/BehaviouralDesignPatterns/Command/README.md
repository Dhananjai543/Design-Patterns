Command Design Pattern

1. We want to represent a request or a method call as an object. Information about parameters passed and the actual operation is encapsulated in a object called command.
2. Advantage of command pattern is that, what would have been a method call is now an object which can be stored for later execution or sent to other parts of code.
3. We can now even queue our command objects and execute them later.

Example:
Imagine you are tasked with designing a remote control system for various electronic devices in a smart home. The devices include a TV, a stereo, and potentially other appliances. The goal is to create a flexible remote control that can handle different types of commands for each device, such as turning devices on/off, adjusting settings, or changing channels.

