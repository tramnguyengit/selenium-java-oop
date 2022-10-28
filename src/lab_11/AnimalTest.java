package lab_11;

import java.util.Arrays;
import java.util.List;

public class AnimalTest {

    public static void main(String[] args) {
        Animal horse = new Horse();
        horse.setName("Horse");
        Animal tiger = new Tiger();
        tiger.setName("Tiger");
        Animal dog = new Dog();
        dog.setName("Dog");

        List<Animal> animalList = Arrays.asList(horse, tiger, dog);
        System.out.println(animalList);
        Animal winner = new AnimalController().getWinner(animalList);
        System.out.println(winner);

    }
}
