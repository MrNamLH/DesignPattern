package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

/*
 * 5. Bill Pugh Singleton Pattern
 * Prior 5, Java memory model has lots of issues when having too many threads trying to get Instance, 
 * so Bill Pugh gives a new approach
 */
public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SingletonHelper {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {

        return SingletonHelper.INSTANCE;
    }
}
