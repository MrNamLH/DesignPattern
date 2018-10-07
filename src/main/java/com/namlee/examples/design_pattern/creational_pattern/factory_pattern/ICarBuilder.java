package com.namlee.examples.design_pattern.creational_pattern.factory_pattern;

import java.util.function.Supplier;

public interface ICarBuilder {

    void add(CarType type, Supplier<ICar> supplier);
}
