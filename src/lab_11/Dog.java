package lab_11;

import java.security.SecureRandom;

public class Dog extends Animal {

/*    @Override
    public int randomSpeed() {
        speed = new SecureRandom().nextInt(60);
        System.out.println("Dog's Speed is " + speed);
        return speed;
    }*/

    public Dog() {
        speed = new SecureRandom().nextInt(90);
    }

    @Override
    public int getSpeed() {
       return this.speed = speed;
    }


}
