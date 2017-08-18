import java.util.List;


public class Warrior extends Player {


        public Warrior(String nick, int hp, int attack, int deff, int power, int mana, int experience, int proffesion, int lvl, int experienceToLvl, List spellList) {
            super(nick, hp, attack, deff, power, mana, experience, proffesion, lvl, experienceToLvl, spellList);
        }

        public int attack() {
            return this.getAttack();
        }

        public int superAttack (){
            return this.getAttack() + this.getAttack();
        }
}

