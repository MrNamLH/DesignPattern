package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    /*
     * The lazy singleton implementation does NOT adapt with multi-threading programming env.
     * So thread safe Singleton implementation will help us
     */
    private ThreadSafeSingleton() {
    }

    /*
     * For improve performance, implement with DoubleLocking
     */
    public static ThreadSafeSingleton getInstanceDoubleLocking() {
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
