package com.Patterns.factory.factories;

import com.Patterns.factory.Animal;
import com.Patterns.factory.CatAnimal;

public class CatAnimalFactory extends AnimalFactory {
    @Override
    public Animal creatAnimal() {
        return new CatAnimal();
    }
}
