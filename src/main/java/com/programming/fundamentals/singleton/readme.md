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
- There is a private instance of the singleton.
- There is a private constructor because we want the singleton itself to call the constructor and 
nobody else.
- No parameters required for construction.

## Code

We can see from our `DBSingleton` Class we will start by creating a basic singleton as below:

```java
public class DBSingleton {

    private static DBSingleton instance = new DBSingleton();

    private DBSingleton(){}
    
    public static DBSingleton getInstance(){
        return instance;
    }
}
```

### Lazy Loaded Singleton

However, looking at the singleton above, we would then want to `Lazy Load` it. In this case 
we would want to load the singleton when we need it. To achieve this we would need to implement
a condition that will check whether our singleton exists already when requested or else generate
a new instance when it doesn't exists already.

```java
public class DBSingleton {

    private static DBSingleton instance = null;

    private DBSingleton(){}
    
    public static DBSingleton getInstance(){
        // Checks if the instance already exists or not.
        if (instance == null){
            // If it is `null` it will assign a new DBSingleton instance.
            instance = new DBSingleton();
        }
        return instance;
    }
}
```

### Thread Safe Singleton

There are scenarios where it has been proven that only doing the above will leave the single 
vulnarable as it will not be `Thread Safe`. In this case we can make sure our singleton is 
Thread Safe by implementing a `synchronized()` method that will make sure our instance Object
is Thread Safe as below:

```java
public class DBSingleton {

    private static DBSingleton instance = null;

    private DBSingleton(){}

    public static DBSingleton getInstance(){
        // At this point we do not care if it is Thread safe or not.
        if (instance == null){
            // If instance is null we will synchronize on the Object - This is where we get our Thread Safety
            synchronized (DBSingleton.class){
                // We then check again if the synchronized `instance` is null
                if (instance == null){
                    // and we instantiate it here :)
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
    }
}
```

## Pitfalls

- Often overused.
- Difficult to unit test.
- If not careful, not thread safe.
- Sometimes confused for `Factory`.
- A rule of thumb is that if it needs a parameter, it is not a singleton anymore,
but rather it would be a factory.
java.util.Calendar is NOT a singleton.
    - Prototype (because you are getting a new instance everytime you call the `getInstance()`)

## Contrast

Singleton | Factory
:---:|:---:
Returns the same instance. (One constructor method - no args)| Returns various instances. (Multiple constructors)
No Interface | Interface driven
... | Adaptable to the environment more easily.