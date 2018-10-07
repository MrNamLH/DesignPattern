package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

/*
 * 2. Static Block Singleton Implementation
 * This is same Eagerly Singleton Implementation, Instance is created at the Class loading time.
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

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
