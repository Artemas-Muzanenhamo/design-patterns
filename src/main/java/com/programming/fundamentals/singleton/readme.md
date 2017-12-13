# Singleton Pattern

## Concepts

- Guarantees that only one instance will be created.
- Guarantees control of a resource.
- Lazily loaded. *(Lazy loading is a concept where we delay the loading of the object until the point where we need it.)*
- Example within Java include: 
    - Runtime Environment
    - Logger (but depending on the implementation as it could be a factory and not a singleton).
    - Spring Beans
    - Graphic Managers
    
## Design

![designpatterns](https://user-images.githubusercontent.com/29547780/33918536-d4951818-dfab-11e7-85b1-77d7a7f36737.png)

- The singleton is responsible for creating itself and managing its lifecycle.
- Static in nature.
- Needs to be thread safe.
- There is a private instanse of the singleton.
- There is a private constructor because we want the singleton itself to call the constructor and 
nobody else.
- No parameters required for construction.