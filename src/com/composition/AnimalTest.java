package com.composition;

import com.dot.C;

public class AnimalTest {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "멍멍이";
        dog.bark();

        Cat cat = new Cat();
        cat.name = "양아치양이";
        cat.bark();
    }
}
