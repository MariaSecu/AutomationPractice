package animals;

import animals.Animal;

public class Cat extends Animal {


    public Cat(int foodQuantite, char name, boolean isBreathe) {
        super(foodQuantite, name, isBreathe);

    }

    @Override
    String isMoving() {
        return "walk";
    }

    @Override
    public void setAge(short age) {
        super.setAge(age);
    }

    @Override
    public short getAge() {
        return super.getAge();
    }
}
