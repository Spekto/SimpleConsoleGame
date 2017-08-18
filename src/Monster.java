/**
 * Created by Admin on 2017-08-17.
 */
public class Monster {
        private String name;
        private int atack;
        private int hp;
        private int mana;
        private int def;

        public Monster(String name, int atack, int hp, int mana, int def) {
            this.name = name;
            this.atack = atack;
            this.hp = hp;
            this.mana = mana;
            this.def = def;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAtack() {
            return atack;
        }

        public void setAtack(int atack) {
            this.atack = atack;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public int getMana() {
            return mana;
        }

        public void setMana(int mana) {
            this.mana = mana;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Monster monster = (Monster) o;

            if (atack != monster.atack) return false;
            if (hp != monster.hp) return false;
            if (mana != monster.mana) return false;
            if (def != monster.def) return false;
            return name != null ? name.equals(monster.name) : monster.name == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + atack;
            result = 31 * result + hp;
            result = 31 * result + mana;
            result = 31 * result + def;
            return result;
        }

        @Override
        public String toString() {
            return "Monster{" +
                    "name='" + name + '\'' +
                    ", atack=" + atack +
                    ", hp=" + hp +
                    ", mana=" + mana +
                    ", def=" + def +
                    '}';
        }

    }

