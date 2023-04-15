package fruitBase.fruits;

public enum Freshness {
    FRESH("свежий"),
    OVERRIPED("перезрелый"),
    SPOILED("испорченный");

    private final String name;

    Freshness(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
