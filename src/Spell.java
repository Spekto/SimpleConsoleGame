/**
 * Created by Admin on 2017-08-17.
 */
public enum Spell {

    FIREBALL("Fire Ball",10,20), HEALING("Healing",10,30), FROZEN("Frozen",15,25);

    private String spellName;
    private int manaUse;
    private int spellAttack;

    Spell(String spellName, int manaUse, int spellAttack) {
        this.spellName = spellName;
        this.manaUse = manaUse;
        this.spellAttack = spellAttack;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getManaUse() {
        return manaUse;
    }

    public int getSpellAttack() {
        return spellAttack;
    }

}
