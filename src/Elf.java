import java.util.List;

/**
 * Created by Admin on 2017-08-17.
 */
public class Elf extends Player {


    public Elf(String nick, int hp, int attack, int deff, int power, int mana, int experience, int proffesion, int lvl, int experienceToLvl) {
        super(nick, hp, attack, deff, power, mana, experience, proffesion, lvl, experienceToLvl);

        addSpell(Spell.FIREBALL);
        addSpell(Spell.HEALING);
    }

    public int attack() {
        return this.getAttack();
    }

    public double criticalAttack() {
        return this.getAttack() + (0.5 * this.getAttack());
    }

}