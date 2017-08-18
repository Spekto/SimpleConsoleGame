/**
 * Created by Admin on 2017-08-17.
 */
public class Magican extends Player {


    public Magican(String nick, int hp, int attack, int deff, int power, int mana, int experience, int proffesion, int lvl, int experienceToLvl) {
        super(nick, hp, attack, deff, power, mana, experience, proffesion, lvl, experienceToLvl);
    }

    public int attack() {
        return this.getAttack();
    }

    public double superAttack (){
        return this.getAttack() + (0.3 * this.getAttack());
    }

}