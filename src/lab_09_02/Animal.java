package lab_09_02;

import java.security.SecureRandom;

public class Animal {

    private String name;

    private int speed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int maxSpeed){
        this.speed = new SecureRandom().nextInt(maxSpeed);
        return speed;
    }

}
