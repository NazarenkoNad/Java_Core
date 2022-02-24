package homework1.animals;

import homework1.animals.Animal;

public class Dog extends Animal {

    public Dog(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance);
    }

    public void swim() {
        System.out.println(getName() + " плывет");
    }
}