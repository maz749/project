package state;

public enum SatisfactionState {
    DISSATISFIED,
    CONTENT,
    SATISFIED;

    public boolean isSatisfied() {
        return this == CONTENT || this == SATISFIED;
    }
}