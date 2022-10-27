package lab_10;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

import static lab_10.Animal.Builder;

public class RacingAnimalTest {

    public static void main(String[] args) {
        Animal tiger = new Builder().setFylable(false).setSpeed(new SecureRandom().nextInt(100)).build();
        Animal horse = new Builder().setFylable(false).setSpeed(new SecureRandom().nextInt(120)).build();
        Animal falcon = new Builder().setFylable(true).setSpeed(new SecureRandom().nextInt(160)).build();
        Animal dog = new Builder().setFylable(false).setSpeed(new SecureRandom().nextInt(70)).build();

        List<Animal> animalList = Arrays.asList(tiger, horse, falcon, dog);

        Animal winner = new RacingAnimalController().getWinner(animalList);
        System.out.println(winner);

       /*Animal tiger = RacingAnimalController.addAnimal("Tiger", false, 70);
       Animal eagle = RacingAnimalController.addAnimal("Eagle", true, 170);
       Animal bird = RacingAnimalController.addAnimal("Bird", true, 110);
       Animal dog = RacingAnimalController.addAnimal("Dog", false, 50);
       Animal horse = RacingAnimalController.addAnimal("Horse", false, 80);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(bird);
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(eagle);

        System.out.println(animalList);
        List<Animal> animalRacerList = RacingAnimalController.getAnimalRacer(animalList);
        RacingAnimalController.getWinner(animalRacerList);
*/
    }
}
