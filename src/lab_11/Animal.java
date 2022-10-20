package lab_11;

public abstract class Animal {

    private String name;
    public int speed;

    public abstract int randomSpeed();

    public String getName() {
        return name;
    }

    public abstract int getSpeed();

    public void setName(String name) {
        this.name = name;
    }
}
