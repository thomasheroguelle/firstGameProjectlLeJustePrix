import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // 1. il nous faut une bibliothèque qui permet de faire des fonctions Random
        Random r = new Random();
        //12. a chaque fois que l'utilisateur essaie de rentrer une valeur, les essais totaux seront affiché sur la console
        int essai = 0;

        // 2. on crée 2 variables = valeurs temporaires
        // 3. "r" permet de cibler la variable "Random"
        // 4. "nexInt" permet de choisir un nombre aleatoire qu'on limite a 200
        int justprix = r.nextInt(200);
        // 5. deuxieme variable : le prix qu'on initialise a 0
        int prix = 0;

        // 6. boucle qui se repete tant qu'elle n'est pas egale au juste prix , se repete tant que condition pas remplie
        while(justprix != prix) {

            System.out.println("entrez un numero entre 0 et 200");
            // 7. scanner = autre element de la bibliotheque java
            // 8. on souhaite scanner la console donc : System.in
            Scanner scan = new Scanner(System.in);


            // 9. si justprix est strictement superieur au prix : c'est plus
           if(justprix > prix) {
               System.out.print("c'est plus ! ");
               // 10. sinon c moins
           } else {
               System.out.println("c'est moins !");
           }

           // 11. on recupere le prix seulement a partir de la
            prix = scan.nextInt();
           // 12. voir variable essai
           essai++;
        }
        System.out.println("Bravo : le juste prix est :" + justprix);
        System.out.println("En "  + essai + " essais ");


    }

}
