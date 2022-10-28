package lab_12;

public class Falcon implements MoveAble, FlyAble {


    @Override
    public int speed() {
        return 30;
    }

    @Override
    public boolean flyAble() {
        return true;
    }

    @Override
    public String toString() {
        return flyAble() + ", " + String.valueOf(speed());
    }
}
