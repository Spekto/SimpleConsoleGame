/**
 * Created by Admin on 2017-08-17.
 */
public class HpPotion {

    private String name;
    private int hp;

    public HpPotion(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HpPotion hpPotion = (HpPotion) o;

        if (hp != hpPotion.hp) return false;
        return name != null ? name.equals(hpPotion.name) : hpPotion.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + hp;
        return result;
    }

    @Override
    public String toString() {
        return "HpPotion{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
