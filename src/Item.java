/**
 * Created by Admin on 2017-08-17.
 */
public abstract class Item {

    private String name;
    private int def;
    private int attack;
    private int power;
    private int mana;
    private int hp;
    private int capacity;

    public Item(String name, int def, int attack, int power, int mana, int hp, int capacity) {
        this.name = name;
        this.def = def;
        this.attack = attack;
        this.power = power;
        this.mana = mana;
        this.hp = hp;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (def != item.def) return false;
        if (attack != item.attack) return false;
        if (power != item.power) return false;
        if (mana != item.mana) return false;
        if (hp != item.hp) return false;
        if (capacity != item.capacity) return false;
        return name != null ? name.equals(item.name) : item.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + def;
        result = 31 * result + attack;
        result = 31 * result + power;
        result = 31 * result + mana;
        result = 31 * result + hp;
        result = 31 * result + capacity;
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", def=" + def +
                ", attack=" + attack +
                ", power=" + power +
                ", mana=" + mana +
                ", hp=" + hp +
                ", capacity=" + capacity +
                '}';
    }
}