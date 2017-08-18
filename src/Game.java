

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Admin on 2017-08-17.
 */
public class Game {
    private Player p;   // gracz w danej grze
    private int dayGame; //dzien gry
    Scanner scanner = new Scanner(System.in);
    Random rand;

    public Game(int dayGame) {
        System.out.println("Wybierz klase swojego bohatera \"mag\" \"wojownik\" \"elf\" ");
        String klasa = scanner.nextLine(); //klasa bohatera
        this.dayGame = dayGame;               //dzien gry
        System.out.println("Podaj nick");
        if (klasa.equals("mag")) {
            p = new Magican(scanner.nextLine(), 1, 2, 3, 4, 5, 0, 1, 0, 100);
        } else if (klasa.equals("wojownik")) {
            p = new Warrior(scanner.nextLine(), 1, 2, 3, 4, 5, 0, 2, 0, 100);
        } else if (klasa.equals("elf")) {
            p = new Elf(scanner.nextLine(), 1, 2, 3, 4, 5, 0, 3, 0, 100);
        }

    }

    public void start() {
        String menuOption;
        int tura = 0;
        do {
            System.out.println("Jest dzien " + this.dayGame);
            System.out.println("Jestes w miescie, co chcesz teraz zrobic ?");
            System.out.println("1 - Sklep");
            System.out.println("2 - Wyjdz z miasta");
            System.out.println("3 - przeczekaj ture ");
            System.out.println("4- menu glowne");
            menuOption = scanner.nextLine();

            switch (menuOption) {
                case "1":
                    System.out.println("Jestes w sklepie"); //odpalamy sklep
                    tura++;
                    break;
                case "2":
                    System.out.println("Wyszedles z miasta"); //wychodzimy do mapy
                    tura++;
                    mapa(tura);
                    break;
                case "3":
                    System.out.println("Czekasz ture zregenerowales 10% hp i many ");
                    tura++;
                    break;
                case "4":
                    System.out.println("STOP"); //tutaj dodamy zapisanie gry automatyczne;
                    break;
                default:
                    System.out.println("Wybierz poprawna opcje");
                    System.out.println();
                    System.out.println();
                    break;
            }
            checkIsNextDay(tura);

        } while (!menuOption.equals("4"));
    }

    void checkIsNextDay(int tura) {
        if (tura >= 6) {
            this.dayGame++;
            tura = 0;
            System.out.println();
            System.out.println("NOWY DZIEN!");

        }
    }

    public void mapa(int tura) {

        System.out.println("Jestes w dzungli, dzien : " + this.dayGame);
        String menuOption;
        do {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1- skrec w lewo ");
            System.out.println("2- skrec w prawo");
            System.out.println("3- idz do przodu");
            System.out.println("4- wroc do miasta");
            menuOption = scanner.nextLine();

            switch (menuOption) {
                case "1":
                    System.out.println("Skreciles w lewo");
                    randAction();

                    break;
                case "2":
                    System.out.println("skreciles w prawo");
                    randAction();

                    break;
                case "3":
                    System.out.println("poszedles do przodu");
                    randAction();

                    break;
                case "4":
                    System.out.println("Wracasz do miasta");
                    start();

                    break;
            }
            tura++;
            checkIsNextDay(tura);

        } while (!menuOption.equals(4));
    }

    void randAction() {
        int optionRand = 0; //int do losowania zdarzen
        optionRand = rand.nextInt(2);
        if (optionRand == 1) {
            System.out.println("SPOTKALES MONSTERA!");
            Monster monster = new Monster("TROLL", 10, 50, 10, 10);//do rozkminy
            fight(monster);
        } else {
            System.out.println("Nic nie znalazles");
        }
    }


    void fight(Monster monster) {
        boolean run = false;
        String option;

        while (run == false) {// do zrobienia menu walki i funkcjaonalnisc
            System.out.println("Zostalo Ci " + p.getHp());
            System.out.println("Podejmij nastepny krok");
            option = scanner.nextLine();
            System.out.println("1-atakuj");
            System.out.println("2-uzyj potka leczenia");
            System.out.println("3-uzyj potka many");
            System.out.println("4- uciekaj");
            switch (option) {
                case "1":
                  fightWithMonster();

                case "2":

                case "3":

                case "4":
                    start();

            }

            if (p.getProffesion() == 2) {

            }
        }
    }

    public Player getP() {
        return p;
    }

    public void setP(Player p) {
        this.p = p;
    }

    public int getDayGame() {
        return dayGame;
    }

    public void setDayGame(int dayGame) {
        this.dayGame = dayGame;
    }


    double tempHealth;

    public void fightWithMonster() {
        Monster monster1 = new Monster("Dzik", 30, 50, 10, 40);
        tempHealth = (monster1.getHp() - p.getAttack());
        String yourChoice;
        do {
            System.out.println("masz " + p.getHp() + " zycia, a potwor: " + monster1.getHp());
            System.out.println("monsterowi zostało: " + tempHealth + " zycia");
            System.out.println("Tobie zostało " +(p.getHp()-monster1.getAtack())+" zycia");
            System.out.println("Atakujesz dalej czy wracasz? t/n");
            yourChoice = scanner.nextLine();
            if (yourChoice.equals("t")) {
                fight(monster1);
            }


        } while (!yourChoice.equals("n"));
        start();
    }
}
