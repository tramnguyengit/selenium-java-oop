package lab_12;

public class Dog implements MoveAble, FlyAble {
    int speed;

    @Override
    public int speed() {
        return 100;
    }

    @Override
    public boolean flyAble() {
        return false;
    }

    @Override
    public String toString() {
        return flyAble() + ", " + String.valueOf(speed());
    }
}
