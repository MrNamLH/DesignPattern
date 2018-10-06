package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    /*
     * The Static Block Singleton Implementation is same Eager Singleton Implementation, 
     * Instance is created at the Class loading time.
     */
    private StaticBlockSingleton() {
    }

    static {
	try {
	    instance = new StaticBlockSingleton();
	} catch (Exception e) {
	    throw new RuntimeException("Exception error when creating static block singleton");
	}
    }

    public static StaticBlockSingleton getInstance() {
	return instance;
    }
}
