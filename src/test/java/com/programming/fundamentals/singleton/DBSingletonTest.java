package com.programming.fundamentals.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DBSingletonTest {

    @Test
    public void whenASingletonIsCalledThenReturnOnlyOneInstanceOfThatObject(){

        DBSingleton instance = DBSingleton.getInstance();
        DBSingleton anotherInstance = DBSingleton.getInstance();

        assertEquals(anotherInstance, instance);

    }


}
