package lab_11;

public abstract class Animal {

    private String name;
    protected int speed;

    public String getName() {
        return name;
    }

    protected abstract int getSpeed();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
