package lab_10;

import java.util.ArrayList;
import java.util.List;

public class RacingAnimalTest {

    public static void main(String[] args) {
       Animal tiger = RacingAnimalMethod.addAnimal("Tiger", false, 70);
       Animal eagle = RacingAnimalMethod.addAnimal("Eagle", true, 170);
       Animal bird = RacingAnimalMethod.addAnimal("Bird", true, 110);
       Animal dog = RacingAnimalMethod.addAnimal("Dog", false, 50);
       Animal horse = RacingAnimalMethod.addAnimal("Horse", false, 80);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(bird);
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(eagle);

        System.out.println(animalList);
        List<Animal> animalRacerList = RacingAnimalMethod.getAnimalRacer(animalList);
        RacingAnimalMethod.getWinner(animalRacerList);

    }


}
