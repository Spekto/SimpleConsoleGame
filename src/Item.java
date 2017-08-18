/**
 * Created by Admin on 2017-08-17.
 */
public enum Item {

    WEAPON("Sword", 2,15,5,10,15,10), ARMOR("Armor",15,2,10,5,10,10);

    private String name;
    private int def;
    private int attack;
    private int power;
    private int mana;
    private int hp;
    private int capacity;

    Item(String name, int def, int attack, int power, int mana, int hp, int capacity) {
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

    public int getDef() {
        return def;
    }

    public int getAttack() {
        return attack;
    }

    public int getPower() {
        return power;
    }

    public int getMana() {
        return mana;
    }

    public int getHp() {
        return hp;
    }

    public int getCapacity() {
        return capacity;
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