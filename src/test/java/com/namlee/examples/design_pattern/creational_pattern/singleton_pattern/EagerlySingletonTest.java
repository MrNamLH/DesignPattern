package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class EagerlySingletonTest extends SingletonTest<EagerlySingleton> {

    public EagerlySingletonTest() {

        super(EagerlySingleton::getInstance);
    }

    @Test
    public void testShowMessage() {

        EagerlySingleton singleton = EagerlySingleton.getInstance();
        assertEquals("Hello World", singleton.showMessage());
        singleton.setMessage("New Message");

        EagerlySingleton anotherSingleton = EagerlySingleton.getInstance();
        assertEquals("New Message", anotherSingleton.showMessage());
        assertSame(singleton, anotherSingleton);
    }
}
