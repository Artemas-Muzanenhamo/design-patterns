# Strategy Pattern

### Definition

* The `Strategy Design Pattern` defines _a family of algorithms_,
  _encapsulates each one_, and _makes them interchangeable_. `Strategy`
  _lets the algorithms vary independently from the clients_ that use it.
  
### The Context

* In our source code, the we have _a family of algorithms_ which are:
    - WildDuck
    - MountainDuck
    - RubberDuck
* Each of these algorithms represent a `Duck` object.
* Each duck has certain characteristics which are:
    - Quacking - `quack()`
    - Displaying - `display()`
    - Flying - `fly()`

### The Problem

* The issue here is that, not all Ducks can _fly_ or _quack_.
* To solve this problem we've created `concrete classes` that represent
our _specific_ `Ducks`.
* HOWEVER, this solution has a flaw! We have two `Ducks` that cannot fly in
this scenario and so we've created a custom class that will contain a `fly()`
method that will not do anything _(since the `Ducks` using this class cannot 
fly)_.