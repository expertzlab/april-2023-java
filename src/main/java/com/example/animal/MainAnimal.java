package com.example.animal;

public class MainAnimal {

    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.speak();

        a1 = new Cat();
        a1.speak();
    }
    
}
