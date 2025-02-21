package character;

import state.HungerState;
import state.SatisfactionState;

public class King extends Character implements Talkable, Thinkable {
    public King(String name) {
        super(name);
    }

    @Override
    public void talk(Character character) {
        System.out.println(name + ": 'Как ты, " + character.getName() + "?'");
    }

    @Override
    public void think(String thought) {
        System.out.println(name + " думает: '" + thought + "'.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " отдыхает на троне.");
        isTired = false;
    }

    @Override
    public void eat() {
        System.out.println(name + " ест с великим аппетитом.");
        hungerState = HungerState.SATISFIED;
        satisfactionState = SatisfactionState.SATISFIED;
    }
}