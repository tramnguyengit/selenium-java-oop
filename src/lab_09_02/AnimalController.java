package lab_09_02;

import java.util.*;

public class AnimalController {

   public void checkWinner(List<Animal> animalList){
       int winnerSpeed = 0;
       String winnerAnimal ="";
       for (Animal animal : animalList) {
          if(animal.getSpeed() >= winnerSpeed){
              winnerSpeed = animal.getSpeed();
              winnerAnimal = animal.getName();
          }

       }
       System.out.println("The winner is the " + winnerAnimal + "with speed is " + winnerSpeed + " Km/h" );
   }

}
