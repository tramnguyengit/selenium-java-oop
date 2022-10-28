package lab_12;

import java.util.ArrayList;
import java.util.List;

public class RacingController {

    public List<FlyAble> eligibleRacers(List<FlyAble> flyAbleList){
        List<FlyAble> eligibleRacers = new ArrayList<>();
        for (FlyAble animal : flyAbleList) {
            if(!animal.flyAble()){
                eligibleRacers.add(animal);
            }
        }
        return eligibleRacers;
    }

    public MoveAble getWinner(List<MoveAble> moveAbleList){
        MoveAble winner = moveAbleList.get(0);
        for (MoveAble animal : moveAbleList) {
            if(animal.speed() > winner.speed()){
                winner = animal;
            }
        }
        return winner;
    }
}
