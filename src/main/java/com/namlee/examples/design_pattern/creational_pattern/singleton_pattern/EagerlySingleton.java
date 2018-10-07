package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

import lombok.Setter;
import lombok.ToString;

/*
 * 1. Eager Singleton Pattern.
 * This is simple way, the Singleton Instance will be created at the class loading time.
 */
@ToString
public class EagerlySingleton {

    @Setter
    private String message;

    private static final EagerlySingleton instance = new EagerlySingleton();

    /*
     * Create a private constructor for Singleton Pattern. So the class can not be instantiate.
     * Disadvantage is that the instance is created but application maybe NOT use it right after creating time.
     */
    private EagerlySingleton() {

        this.message = "Hello World";
    }

    public static EagerlySingleton getInstance() {

        return instance;
    }

    public String showMessage() {

        return this.message;
    }

}
