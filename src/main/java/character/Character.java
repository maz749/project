package character;

import state.HungerState;
import state.SatisfactionState;

public abstract class Character {
    protected String name;
    protected boolean isTired;
    protected HungerState hungerState;
    protected SatisfactionState satisfactionState;

    public Character(String name) {
        this.name = name;
        this.isTired = false;
        this.hungerState = HungerState.HUNGRY;
        this.satisfactionState = SatisfactionState.DISSATISFIED;
    }

    public abstract void sleep();
    public abstract void eat();

    public String getName() {
        return name;
    }

    public boolean isTired() {
        return isTired;
    }

    public HungerState getHungerState() {
        return hungerState;
    }

    public SatisfactionState getSatisfactionState() {
        return satisfactionState;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character character = (Character) obj;
        return name.equals(character.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', hungerState=" + hungerState + ", satisfactionState=" + satisfactionState + "}";
    }
}