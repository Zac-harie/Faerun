package jeu;

import java.util.Random;

public class GuerrierUtil {

    public static void printUnite(Guerrier unite){
        System.out.println("Le "+unite.getClass().getSimpleName()+" n'a plus que "+unite.getPointsDeVie()+" PV.");
    }

    public static int de3(){
        Random de = new Random();
        return de.nextInt(3)+1;
    }

    public static int de3(int nbLancers){
        int somme=0;
        for (int i = 0; i < nbLancers; i++) {
            somme+=de3();
        }
        return somme;
    }
}
