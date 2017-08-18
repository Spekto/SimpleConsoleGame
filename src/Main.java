import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Admin on 2017-08-17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Witamy w grze Dopadnij potowra!");
        String menuOption; //zmienna do wyboru menu
        Scanner scanner= new Scanner(System.in);

        do{
            System.out.println("Glowne menu");
            System.out.println("1-Nowa Gra");
            System.out.println("2-Wczytaj Gre");
            System.out.println("3-Zapisz gre");
            System.out.println("4- Graj dalej");
            System.out.println("0-Wyjscie");
            menuOption = scanner.nextLine();
            Game game = null;
            switch(menuOption){
                case "1":
                    System.out.println("Zaczynasz nowa gre");
                     game= new Game(1);
                    game.start();
                    break;
                case "2":
                    System.out.println("Wczytujesz gre");
                    break;
                case "3":
                    System.out.println("Zapisuje gre");
                    break;
                case "4":
                    System.out.println("Kontynuuje gre");
                    if(game!=null) {
                        game.start();
                    }
                case "0":
                    System.out.println("Wylaczam gre");
                    break;
                default:
                    System.out.println("Wprowadziles zla opcje");
                    break;
            }



        }while(!menuOption.equals("0"));
    }
}
