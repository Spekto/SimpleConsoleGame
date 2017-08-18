/**
 * Created by Admin on 2017-08-17.
 */
public class Spell {

    private String spellName;
    private int manaUse;
    private int spellAttack;

    public Spell(String spellName, int manaUse, int spellAttack) {
        this.spellName = spellName;
        this.manaUse = manaUse;
        this.spellAttack = spellAttack;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public int getManaUse() {
        return manaUse;
    }

    public void setManaUse(int manaUse) {
        this.manaUse = manaUse;
    }

    public int getSpellAttack() {
        return spellAttack;
    }

    public void setSpellAttack(int spellAttack) {
        this.spellAttack = spellAttack;
    }
}
