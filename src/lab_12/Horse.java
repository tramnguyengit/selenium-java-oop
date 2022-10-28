package lab_12;

public class Horse implements MoveAble, FlyAble {


    @Override
    public int speed() {
        return 60;
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
