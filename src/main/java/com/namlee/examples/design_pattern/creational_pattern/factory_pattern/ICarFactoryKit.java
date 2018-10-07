package com.namlee.examples.design_pattern.creational_pattern.factory_pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface ICarFactoryKit {

    ICar create(CarType type);

    static ICarFactoryKit factory(Consumer<ICarBuilder> consumer) {

        Map<CarType, Supplier<ICar>> map = new HashMap<>();
        consumer.accept(map::put);

        return name -> map.get(name).get();
    }

}
