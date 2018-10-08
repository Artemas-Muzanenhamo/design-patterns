package com.programming.fundamentals.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        System.out.println(rubberDuck.quack());
        System.out.println(rubberDuck.display());
        System.out.println(rubberDuck.fly());
    }
}
