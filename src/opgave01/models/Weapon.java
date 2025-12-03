package opgave01.models;

public class Weapon {
    private String name;
    private Warrior owner;

    public Weapon(String name) {
        this.name = name;
        owner = null;
    }

    public Warrior getOwner() {
        return owner;
    }

    public void setOwner(Warrior warrior) {
        owner = warrior;
    }
}
