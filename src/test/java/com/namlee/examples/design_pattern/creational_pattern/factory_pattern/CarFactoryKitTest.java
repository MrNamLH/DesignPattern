package com.namlee.examples.design_pattern.creational_pattern.factory_pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarFactoryKitTest {

    private ICarFactoryKit factory;

    @BeforeEach
    public void init() {

        this.factory = ICarFactoryKit.factory(builder -> {
            builder.add(CarType.Audi, Audi::new);
            builder.add(CarType.BMW, BMW::new);
            builder.add(CarType.Mercedes, Mercedes::new);
        });
    }

    @Test
    public void testAudi() {

        ICar audi = this.factory.create(CarType.Audi);
        this.verifyCar(audi, Audi.class);
    }

    @Test
    public void testBMW() {

        ICar bmw = this.factory.create(CarType.BMW);
        this.verifyCar(bmw, BMW.class);
    }

    @Test
    public void testMercedes() {

        ICar mercedes = this.factory.create(CarType.Mercedes);
        this.verifyCar(mercedes, Mercedes.class);
    }

    private void verifyCar(ICar car, Class<?> clazz) {

        assertTrue(clazz.isInstance(car), "Car must be an instance of: " + clazz.getName());
    }
}
