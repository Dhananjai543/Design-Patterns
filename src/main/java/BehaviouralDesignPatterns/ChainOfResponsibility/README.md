Chain of Responsibility Pattern

1. We need to avoid coupling the code which sends the request to the code which processes the request.  
2. Typically, the code which wants some request handled calls the exact method on an exact object to process it, thus the tight coupling. Chain of responsibility solves this problem by giving more than one object, chance to process the request.
3. We create objects which are chained together by one object knowing reference of object which is next in chain. We give request to first object in chain, if it can't handle then it simply passes the request down the chain.

