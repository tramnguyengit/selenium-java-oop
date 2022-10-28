package lab_12;

public class Eagle implements MoveAble, FlyAble {


    @Override
    public int speed() {
        return 100;
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
