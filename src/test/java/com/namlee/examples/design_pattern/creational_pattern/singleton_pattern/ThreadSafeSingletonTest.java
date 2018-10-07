package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

public class ThreadSafeSingletonTest extends SingletonTest<ThreadSafeSingleton> {

    public ThreadSafeSingletonTest() {

        super(ThreadSafeSingleton::getInstance);
    }
}
