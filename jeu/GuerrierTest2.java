package jeu;

public class GuerrierTest2 {
    public static void main(String[] args) {
        ChefElfe ce = new ChefElfe();
        ChefNain cn = new ChefNain();

        while(ce.estVivant() & cn.estVivant()){
            ce.attaquer(cn);
            GuerrierUtil.printUnite(cn);
            if(cn.estVivant()){
                cn.attaquer(ce);
                GuerrierUtil.printUnite(ce);
            }
        }
    }
}
