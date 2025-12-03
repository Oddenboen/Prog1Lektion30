package opgave01;

import opgave01.models.*;

import java.lang.Character;

public class Main {
    public static void main(String[] args) {
        Barbarian fofstelr = new Barbarian("Fofstelr", 1);
        Weapon longsword = new Weapon("Longsword");
        fofstelr.addWeapon(longsword);
        Spell fireball = new Spell(150,Duration.INSTANTANEOUS,"Fireball");
        Wizard orlemaex = new Wizard("Orlemaex",1);
        Ranged shortbow = new Ranged("Shortbow", 80);
        fofstelr.addWeapon(shortbow);


    }
}
