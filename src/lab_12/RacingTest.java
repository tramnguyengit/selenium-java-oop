package lab_12;

import java.util.Arrays;
import java.util.List;

public class RacingTest {

    public static void main(String[] args) {
        RacingController racingController = new RacingController();
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Horse horse = new Horse();
        Falcon falcon = new Falcon();
        List animalList = racingController.eligibleRacers(Arrays.asList(dog, horse, eagle, falcon));
        System.out.println(animalList);
        MoveAble winner = racingController.getWinner(animalList);
        System.out.println(winner);
    }
}
