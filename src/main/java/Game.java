import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Random r = new Random();
        int justprix = r.nextInt(200);
        int prix = 0;

        while(justprix != prix) {

            System.out.println("entrez un numero entre 0 et 200");
            Scanner scan = new Scanner(System.in);

           prix = scan.nextInt();

           if(justprix > prix) {
               System.out.print("c'est plus ! ");
           } else {
               System.out.println("c'est moins !");
           }



        }
        System.out.println("Bravo : le juste prix est :" + justprix);

    }

}
