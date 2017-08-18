import java.util.List;

/**
 * Created by Admin on 2017-08-17.
 */
public class  Player {
    private String nick;
    private int hp;
    private int attack;
    private int deff;
    private int power;
    private int mana;
    private int experience;
    private int proffesion;
    private int lvl;
    private int experienceToLvl;
    private List<Spell> spellList;


    public Player(String nick, int hp, int attack, int deff, int power, int mana, int experience, int proffesion, int lvl, int experienceToLvl) {
        this.nick = nick;
        this.hp = hp;
        this.attack = attack;
        this.deff = deff;
        this.power = power;
        this.mana = mana;
        this.experience = experience;
        this.proffesion = proffesion;
        this.lvl = lvl;
        this.experienceToLvl = experienceToLvl;
    }



    public void addSpell(Spell spell){
        spellList.add(spell);
    }

    public List<Spell> getPlayerSpells() {
        return spellList;
    }
    //getey i setery
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDeff() {
        return deff;
    }

    public void setDeff(int deff) {
        this.deff = deff;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getProffesion() {
        return proffesion;
    }

    public void setProffesion(int proffesion) {
        this.proffesion = proffesion;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExperienceToLvl() {
        return experienceToLvl;
    }

    public void setExperienceToLvl(int experienceToLvl) {
        this.experienceToLvl = experienceToLvl;
    }

    //toString()
    @Override
    public String toString() {
        return "Player.Player{" +
                "nick='" + nick + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", deff=" + deff +
                ", power=" + power +
                ", mana=" + mana +
                '}';
    }

    public void addExperience (int experience) {
        this.experience += experience;
        checkIfLvLUp();
    }

    public void checkIfLvLUp() {
        if (this.experience >= this.experienceToLvl) {
            lvl++;
            this.experience = 0;
            this.experienceToLvl = this.experienceToLvl + 100 * lvl;
            System.out.println(" ! level UP ! ");
        }
    }

    public void damagePlayer() {
        this.hp -= hp;
    }

    public void addPlayerHp() {
        this.hp += hp;
    }

}