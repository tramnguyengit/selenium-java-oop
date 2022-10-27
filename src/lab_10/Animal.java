package lab_10;

import java.security.SecureRandom;

public class Animal {

    //Outner - READONLY

    private String name;

    private boolean fylable;
    private int speed;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.fylable = builder.fylable;
        this.speed = builder.speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFylable() {
        return fylable;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", fylable=" + fylable +
                ", speed=" + speed +
                '}';
    }

    //Inner - WRITE ONLZy
    public static class Builder {
        private String name;
        private boolean fylable;
        private int speed;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFylable(boolean fylable) {
            this.fylable = fylable;
            return this;
        }

        public Builder setSpeed(int maxSpeed){
            this.speed = new SecureRandom().nextInt(maxSpeed);
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }
}
