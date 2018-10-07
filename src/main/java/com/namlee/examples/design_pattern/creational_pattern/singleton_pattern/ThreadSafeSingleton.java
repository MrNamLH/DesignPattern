package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

/*
 * 4. Thread Safe Singleton Pattern
 * The lazy singleton implementation does NOT adapt with multi-threading programming env.
 * So Thread Safe Singleton implementation will help us
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    /*
     * For improve performance, implement with DoubleLocking
     */
    public static ThreadSafeSingleton getInstance() {

        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
