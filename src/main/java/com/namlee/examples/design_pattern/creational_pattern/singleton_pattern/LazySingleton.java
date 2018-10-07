package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

/*
 * 3. Lazy Singleton Implementation
 * This will create Singleton Instance at the first time of Client call.
 */
public class LazySingleton {

    private static LazySingleton instance;

    public static LazySingleton getInstance() {

        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
