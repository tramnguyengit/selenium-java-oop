package lab_11;

import java.security.SecureRandom;

public class Horse extends Animal {

    @Override
    public int randomSpeed() {
        speed = new SecureRandom().nextInt(90);
        System.out.println("Horse's Speed is " + speed);
        return speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
