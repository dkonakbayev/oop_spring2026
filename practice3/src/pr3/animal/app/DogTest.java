package pr3.animal.app;

import java.util.*;
import pr3.animal.model.*;

public class DogTest {

    public static void main(String[] args) {

        Animal dog1 = new Dog("Rex", 3, "Labrador");
        Dog dog2 = new Dog("Buddy", 5, "Beagle");
        Dog dog3 = new Dog("Max", 2, "Husky");
        Animal cat1 = new Cat("Kitty" , 3 , "British");

        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(cat1);

        for (Animal a : animals) {
            a.getInfo();
            a.makeSound();
            a.eat();
            a.eat("meat");
            System.out.println("----------------");
        }
    }
}   