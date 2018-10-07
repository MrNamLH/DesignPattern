package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

public class BillPughSingletonTest extends SingletonTest<BillPughSingleton> {

    public BillPughSingletonTest() {

        super(BillPughSingleton::getInstance);
    }
}
