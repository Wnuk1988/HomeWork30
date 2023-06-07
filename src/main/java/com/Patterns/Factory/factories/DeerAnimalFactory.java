package com.Patterns.Factory.factories;

import com.Patterns.Factory.Animal;
import com.Patterns.Factory.DeerAnimal;

public class DeerAnimalFactory extends AnimalFactory {
    @Override
    public Animal creatAnimal() {
        return new DeerAnimal();
    }
}
