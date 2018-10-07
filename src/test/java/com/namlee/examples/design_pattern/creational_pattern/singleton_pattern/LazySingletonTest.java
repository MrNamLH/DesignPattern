package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

public class LazySingletonTest extends SingletonTest<LazySingleton> {

    public LazySingletonTest() {

        super(LazySingleton::getInstance);
    }

}
