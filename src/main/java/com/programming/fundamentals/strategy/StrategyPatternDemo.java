package com.programming.fundamentals.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        System.out.println("-------Rubber Duck--------");
        Duck rubberDuck = new RubberDuck();
        System.out.println(rubberDuck.display());
        System.out.println(rubberDuck.quack());
        System.out.println(rubberDuck.fly());

        System.out.println("-------Mountai Duck ------");
        Duck mountainDuck = new MountainDuck();
        System.out.println(mountainDuck.display());
        System.out.println(mountainDuck.quack());
        System.out.println(mountainDuck.fly());

        System.out.println("---------Wild Duck -------");
        Duck wildDuck = new WildDuck();
        System.out.println(wildDuck.display());
        System.out.println(wildDuck.quack());
        System.out.println(wildDuck.fly());
    }
}
