package com.namlee.examples.design_pattern.creational_pattern.factory_pattern;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CarFactoryTest {

    @Test
    public void testProduce() {

        CarFactory carFactory = new CarFactory();
        assertTrue("Test fail with Audi", carFactory.produce(CarType.Audi).info().contains("Audi"));
        assertTrue("Test fail with BMW", carFactory.produce(CarType.BMW).info().contains("BMW"));
        assertTrue("Test fail with Mercedes", carFactory.produce(CarType.Mercedes).info().contains("Mercedes"));
    }
}
