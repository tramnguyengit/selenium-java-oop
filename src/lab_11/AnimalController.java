package lab_11;

import java.util.List;

public class AnimalController {

    public Animal getWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }


  /* public void checkWinner(List<Animal> animalList){
       int winnerSpeed = 0;
       String winnerAnimal = null;
       for (Animal animal : animalList) {
          if(animal.speed > winnerSpeed){
              winnerSpeed = animal.getSpeed();
              winnerAnimal= animal.getName();
          }
       }
       System.out.println("The winner is the " + winnerAnimal + " with speed is " + winnerSpeed + " Km/h" );
   }*/
}
