package opgave01.models;

import java.util.ArrayList;

public class Spellcaster extends Character {
    private ArrayList<Spell> spells;

    public Spellcaster(String name, int level) {
        super(name, level);
        spells = new ArrayList<>();
    }

    public void addSpells(Spell spell) {
        if (!spells.contains(spell)) {
            spells.add(spell);
        }
    }
}
