package item;

import character.Character;

public abstract class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract void interact(Character character);

    @Override
    public String toString() {
        return "Item{name='" + name + "'}";
    }
}