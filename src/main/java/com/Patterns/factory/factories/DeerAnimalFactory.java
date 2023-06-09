package com.Patterns.factory.factories;

import com.Patterns.factory.Animal;
import com.Patterns.factory.DeerAnimal;

public class DeerAnimalFactory extends AnimalFactory {
    @Override
    public Animal creatAnimal() {
        return new DeerAnimal();
    }
}
