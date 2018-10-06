package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSingletonExample {

    @Test
    public void testShowMessage() {
	SingletonExample singleton = SingletonExample.getInstance();
	assertEquals("Hello World", singleton.showMessage());
	singleton.setMessage("New Message");

	SingletonExample anotherSingleton = SingletonExample.getInstance();
	assertEquals("New Message", anotherSingleton.showMessage());
	assertEquals(singleton, anotherSingleton);
    }

}
