package com.programming.fundamentals.strategy;

public class MountainDuck extends NoFlying implements Duck {
    @Override
    public String quack() {
        return "Mountain Duck Quack";
    }

    @Override
    public String display() {
        return "Mountain Duck";
    }

    @Override
    public String fly() {
        return super.fly();
    }
}
