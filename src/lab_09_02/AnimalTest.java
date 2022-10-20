package lab_09_02;

import java.util.*;

public class AnimalTest {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.setName("Horse");
        System.out.println("Horse's Speed is " + horse.setSpeed(0));
        Tiger tiger = new Tiger();
        tiger.setName("Tiger");
        System.out.println("Tiger's Speed is " + tiger.setSpeed(0));
        Dog dog = new Dog();
        dog.setName("Dog");
        System.out.println("Dog's Speed is " + dog.setSpeed(0));

        List<Animal> animalList = Arrays.asList(horse, tiger, dog);
        new AnimalController().checkWinner(animalList);

    }
}
