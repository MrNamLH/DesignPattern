package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

public class StaticBlockSingletonTest extends SingletonTest<StaticBlockSingleton> {

    public StaticBlockSingletonTest() {

        super(StaticBlockSingleton::getInstance);
    }
}
