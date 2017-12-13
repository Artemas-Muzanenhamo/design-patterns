package com.programming.fundamentals.singleton;

public class DBSingletonDemo {

    public static void main(String[] args) {

        // This will not work here as we have a private instance for DBSingleton()
        // DBSingleton anotherInstance = new DBSingleton();

        DBSingleton instance = DBSingleton.getInstance();
        System.out.println(instance);

        DBSingleton anotherInstance = DBSingleton.getInstance();
        System.out.println(anotherInstance); // This will display the same object of "instance"
    }
}
