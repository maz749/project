package character;

import state.HungerState;
import state.SatisfactionState;

public class Prince extends Character implements Restable, Emotional, Moveable {
    public Prince(String name) {
        super(name);
    }

    @Override
    public void rest() {
        System.out.println(name + " отдыхает.");
        isTired = false;
    }

    @Override
    public void expressEmotion(String emotion) {
        System.out.println(name + " чувствует себя " + emotion + ".");
    }

    @Override
    public void move(String destination) {
        System.out.println(name + " идет в " + destination + ".");
    }

    @Override
    public void sleep() {
        System.out.println(name + " заснул.");
        isTired = true;
    }

    @Override
    public void eat() {
        if (hungerState == HungerState.HUNGRY || hungerState == HungerState.STARVING) {
            System.out.println(name + " поел.");
            hungerState = HungerState.SATISFIED;
            satisfactionState = SatisfactionState.SATISFIED;
        } else {
            System.out.println(name + " не голоден.");
        }
    }
}