package lab_10;

import java.util.ArrayList;
import java.util.List;

public class RacingAnimalMethod {

    private static final List<Animal> animalRacerList = new ArrayList<>();

    protected static List<Animal> getAnimalRacer(List<Animal> animalList) {
        for (Animal animal : animalList) {
            if(!animal.isFylable()){
                animalRacerList.add(animal);
            }
        }
        System.out.println(animalRacerList);
        return animalRacerList;
    }

    protected static void getWinner(List<Animal> animalList){
        int winnerSpeed = 0;
        String winnerAnimal ="";
        for (Animal animal : animalList) {
            if(animal.getSpeed() >= winnerSpeed){
                winnerAnimal = animal.getName();
                winnerSpeed = animal.getSpeed();
            }
        }
        System.out.println("The winner is the " + winnerAnimal + " with speed is " + winnerSpeed + " Km/h" );
    }

    static Animal addAnimal(String name, boolean flyable, int maxSpeed){
        Animal.Builder builder = new Animal.Builder();
        builder.setName(name)
                .setFylable(flyable)
                .setSpeed(maxSpeed);
        Animal animal = builder.build();
        System.out.println(animal);
        return animal;
    }

}
