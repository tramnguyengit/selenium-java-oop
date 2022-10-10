package lab_09_02;

import java.security.SecureRandom;

public class Horse extends Animal {

    @Override
    public int setSpeed(int speed){
        return super.setSpeed(75);
    }
}
