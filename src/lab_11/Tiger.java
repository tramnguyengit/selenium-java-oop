package lab_11;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public Tiger(){
        speed = new SecureRandom().nextInt(70);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
