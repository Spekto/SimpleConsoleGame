/**
 * Created by Admin on 2017-08-17.
 */
public class ManaPotion {
    private String name;
    private int mana;

    public ManaPotion(String name, int mana) {
        this.name = name;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManaPotion that = (ManaPotion) o;

        if (mana != that.mana) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + mana;
        return result;
    }

    @Override
    public String toString() {
        return "ManaPotion{" +
                "name='" + name + '\'' +
                ", mana=" + mana +
                '}';
    }
}