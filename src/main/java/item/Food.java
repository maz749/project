package item;

import character.Character;

public class Food extends Item implements Interactable, Eatable {
    private String foodName;

    public Food(String foodName) {
        super(foodName);
        this.foodName = foodName;
    }

    @Override
    public void interact(Character character) {
        System.out.println(character.getName() + " взаимодействует с " + foodName);
        eat(character);
    }

    @Override
    public void eat(Character character) {
        System.out.println(character.getName() + " ест " + foodName);
        character.eat();
    }

    // Добавляем метод getName()
    public String getName() {
        return foodName;
    }

    @Override
    public String toString() {
        return "Food{name='" + foodName + "'}";
    }

    @Override
    public void eat(java.lang.Character character) {

    }

    @Override
    public void interact(java.lang.Character character) {

    }
}