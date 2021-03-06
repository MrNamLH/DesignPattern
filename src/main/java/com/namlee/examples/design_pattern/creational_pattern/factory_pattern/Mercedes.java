package com.namlee.examples.design_pattern.creational_pattern.factory_pattern;

import java.util.Random;

public class Mercedes implements ICar {

    private int id;

    public Mercedes() {

        Random random = new Random();
        this.id = random.nextInt();
    }

    @Override
    public String info() {

        return String.format("%s with id = %d", this.getClass().getName(), this.id);
    }

}
