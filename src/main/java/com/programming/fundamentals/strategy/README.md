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
this scenario (_Mountain Duck_ and _Rubber Duck_),and so we've created a custom class that will contain a `fly()`
method that will be called by those two ducks which cannot fly.
    * Suppose we had 1000 ducks in total, and we had scenarios were some ducks
    could not fly and some ducks could not quack nor display. 
    * How many custom classes would we created and how many ducks(algorithms) would we have to change to 
    extend those custom classes? *MANY DUCKS !!!*