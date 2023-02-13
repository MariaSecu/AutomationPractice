package animals;

import animals.Cat;

public class Execution {
    public static void main(String[] args) {
        Cat bob = new Cat(2, 'B', true);
        bob.setAge((short) 4.2);
        //bob.getAge();
        bob.setPrice(500.8);
        //bob.getPrice();
        bob.setHoursOfSleep(9);
        System.out.println("The age of Bob is: " + bob.getAge() + " years " + " He has a price of: " + bob.getPrice() + " euro, " +
                "eat a quantite of food = " + bob.foodQuantite + " and  sleep, " + bob.getHoursOfSleep() + " hours " +
                " his initial is " + bob.initialOfName + " and breathing is: " + bob.isBreathe);
        System.out.println("Bob is moving by " + bob.isMoving());

    }
}
