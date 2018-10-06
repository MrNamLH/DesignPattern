package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

import lombok.Setter;

public class SingletonExample {

    @Setter
    private String message;

    /*
     * Eager Singleton Pattern.
     * This is simple way, the Singleton Instance will be created at the class loading time.
     */
    private static final SingletonExample instance = new SingletonExample();

    /*
     * Create a private constructor for Singleton Pattern. So the class can not be instantiate.
     * Disadvantage is that the instance is created but application maybe NOT use it right after creating time.
     */
    private SingletonExample() {
	this.message = "Hello World";
    }

    public static SingletonExample getInstance() {
	return instance;
    }

    public String showMessage() {
	return this.message;
    }

}
