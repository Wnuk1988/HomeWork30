package com.Patterns.Factory;

public class CatAnimal extends Animal {
    public CatAnimal() {
        species = "Cat";
        characteristic.add("A pet");
        characteristic.add("(4 paws,ears, tail and mustache)");
        characteristic.add("Wool");
        characteristic.add("Voice meow!");
    }
}
