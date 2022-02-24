package homework1.obstacles;

import homework1.Participant;
import homework1.animals.Animal;

public class Cross extends Obstacle {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}