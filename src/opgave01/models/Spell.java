package opgave01.models;

public class Spell {
    private int range;
    private Duration duration;
    private String name;

    public Spell(int range, Duration duration, String name) {
        this.range = range;
        this.duration = duration;
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }
}
