package com.programming.fundamentals.strategy;

public class RubberDuck extends NoFlying implements Duck {
    @Override
    public String quack() {
        return "Can Squeak";
    }

    @Override
    public String display() {
        return "Rubber Duck";
    }

    @Override
    public String fly() {
        return super.fly();
    }
}
