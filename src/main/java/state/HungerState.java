package state;

public enum HungerState {
    STARVING,
    HUNGRY,
    SATISFIED;

    public boolean isHungry() {
        return this == STARVING || this == HUNGRY;
    }
}