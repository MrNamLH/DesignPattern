package com.namlee.examples.design_pattern.creational_pattern.factory_pattern;

/*
 * Factory Pattern provides an interface for integration and hidden the complex implementation of related components.
 */
public class CarFactory {

    public ICar produce(CarType type) {

        ICar car = null;

        switch (type) {
            case Audi:
                car = new Audi();
                break;

            case BMW:
                car = new BMW();
                break;

            case Mercedes:
                car = new Mercedes();
                break;

            default:
                break;
        }

        return car;
    }
}
