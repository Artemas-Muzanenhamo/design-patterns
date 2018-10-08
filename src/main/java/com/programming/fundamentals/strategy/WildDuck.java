package com.programming.fundamentals.strategy;

public class WildDuck implements Duck {
    @Override
    public String quack() {
        return "Wild Duck Quack";
    }

    @Override
    public String display() {
        return "Wild Duck";
    }

    @Override
    public String fly() {
        return "Wild Duck can Fly";
    }
}
