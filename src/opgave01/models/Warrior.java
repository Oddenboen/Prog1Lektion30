package opgave01.models;

import java.util.ArrayList;

public class Warrior extends Character{
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int level) {
        super(name,level);
        weapons = new ArrayList<>();
    }

    public void addWeapon(Weapon weapon) {
        if (!weapons.contains(weapon)) {
            weapons.add(weapon);
            weapon.setOwner(this);
        }
    }

    public ArrayList<Weapon> getWeapons() {
        return new ArrayList<>(weapons);
    }
}
