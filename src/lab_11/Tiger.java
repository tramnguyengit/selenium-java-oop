package lab_11;

import java.security.SecureRandom;

public class Tiger extends Animal {

    @Override
    public int randomSpeed() {
        speed = new SecureRandom().nextInt(70);
        System.out.println("Tiger's Speed is " + speed);
        return speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
