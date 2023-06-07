package com.Patterns.Factory.factories;

import com.Patterns.Factory.Animal;
import com.Patterns.Factory.CatAnimal;

public class CatAnimalFactory extends AnimalFactory {
    @Override
    public Animal creatAnimal() {
        return new CatAnimal();
    }
}
