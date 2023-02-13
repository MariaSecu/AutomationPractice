package animals;

public abstract class Animal {
    private short age;
    private float hoursOfSleep;
    private double price;
    int foodQuantite;
    boolean isBreathe = true;
    char initialOfName;

    abstract String isMoving();

    public Animal(int foodQuantite, char name, boolean isBreathe) {
        this.initialOfName = name;
        this.foodQuantite = foodQuantite;
        this.isBreathe = isBreathe;


    }

    public void setAge(short age) {
        this.age = age;
    }

    public short getAge() {
        return age;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setHoursOfSleep(float sleep) {
        this.hoursOfSleep = sleep;
    }

    public float getHoursOfSleep() {
        return hoursOfSleep;
    }
}
