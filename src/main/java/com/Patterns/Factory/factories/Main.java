package com.Patterns.Factory.factories;

import com.Patterns.Factory.Animal;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new CatAnimalFactory();
        Animal animals = factory.creatAnimal();
        System.out.println(animals.species);
        System.out.println(animals.characteristic);
        AnimalFactory factory1 = new DeerAnimalFactory();
        Animal animals1 = factory1.creatAnimal();
        System.out.println(animals1.species);
        System.out.println(animals1.characteristic);
    }
}
