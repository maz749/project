package character;

import item.Food;
import state.HungerState;


import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Servant extends Character implements Observable, Feedable {
    private static final LogManager logger = LogManager.getLogManager();
    public Servant(String name) {
        super(name);
    }

    @Override
    public void observe(Character character) {
        if (character.getHungerState() == HungerState.HUNGRY) {
            System.out.println(name + ": '" + character.getName() + " голоден. Нужно принести еду.'");
        } else {
            System.out.println(name + ": '" + character.getName() + " не голоден.'");
        }
    }

    @Override
    public void feed(Character character, Food food) {
        System.out.println(name + " кормит " + character.getName() + " " + food.getName());
        character.eat();
    }

    @Override
    public void sleep() {
        System.out.println(name + " пошел отдыхать.");
        isTired = true;
    }

    @Override
    public void eat() {
        System.out.println(name + " не голоден, но следит за Принцем.");
    }
}