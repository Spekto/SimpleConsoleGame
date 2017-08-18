public class Main2 {
    public static void main(String[] args) {
        Monster monster = new Monster("Lewak", 15, 100, 20, 30);
        Monster monster1 = new Monster("Dzik", 30, 50, 10, 40);

        Monster monster2 = new Monster("LewakUp", 30, 200, 40, 60);
        Monster monster3 = new Monster("DzikUp", 60, 100, 20, 80);

        Monster monster4 = new Monster("LewakMedium", 45, 300, 60, 90);
        Monster monster5 = new Monster("DzikMedium", 90, 150, 30, 120);

        Monster monster6 = new Monster("LewakHard", 70, 450, 100, 130);
        Monster monster7 = new Monster("DzikHard", 150, 250, 500, 150);

        Monster monster8 = new Monster("LewakUltraHard", 300, 1000, 100, 400);
        Monster monster9 = new Monster("DzikUltraHard", 600, 750, 500, 800);

        Armor armor = new Armor("Defender", 30, 5, 15,10, 10, 20);
        Armor armor1 = new Armor("DefenderUp", 60, 10, 20,20, 30, 30);
        Armor armor2 = new Armor("DefenderMedium", 90, 10, 35,20, 30, 40);
        Armor armor3 = new Armor("DefenderHard", 150, 15, 55,35, 35, 60);
        Armor armor4 = new Armor("DefenderUltraHard", 200, 20, 60,50, 50, 80);

        Weapon weapon = new Weapon("MutherFucker", 5,30, 10,5,10, 30);
        Weapon weapon1 = new Weapon("MutherFuckerUp", 15,50, 20,15,20, 40);
        Weapon weapon2 = new Weapon("MutherFuckerMedium", 40,100, 30,15,30, 50);
        Weapon weapon3 = new Weapon("MutherFuckerHard", 70,250, 50,25,40, 70);
        Weapon weapon4 = new Weapon("MutherFuckerUltraHard", 80,350, 80,45,60, 80);

        HpPotion potion = new HpPotion("Potion", 20);
        HpPotion potion1 = new HpPotion("PotionUp", 30);
        HpPotion potion2 = new HpPotion("PotionMedium", 40);
        HpPotion potion3 = new HpPotion("PotionHard", 80);
        HpPotion potion4 = new HpPotion("PotionUltraHard", 100);

        ManaPotion manaPotion = new ManaPotion("MPOt", 10);
        ManaPotion manaPotion1 = new ManaPotion("MPOtUp", 20);
        ManaPotion manaPotion2 = new ManaPotion("MPOtMedium", 30);
        ManaPotion manaPotion3 = new ManaPotion("MPOtHard", 40);
        ManaPotion manaPotion4 = new ManaPotion("MPOtUltraHard", 80);
    }
}