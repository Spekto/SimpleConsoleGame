/**
 * Created by Admin on 2017-08-17.
 */
import java.util.List;
public class Magican extends Player {


    public Magican(String nick, int hp, int attack, int deff, int power, int mana, int experience, int proffesion, int lvl, int experienceToLvl) {
        super(nick, hp, attack, deff, power, mana, experience, proffesion, lvl, experienceToLvl);


        addSpell(Spell.FIREBALL);
        addSpell(Spell.FROZEN);
        addSpell(Spell.HEALING);
    }

    public int attack() {
        return this.getAttack();
    }

    public double superAttack (){
        return this.getAttack() + (0.3 * this.getAttack());
    }

}