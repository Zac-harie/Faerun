package jeu;

public class ChefNain extends Nain {

    public static final int RESSOURCES=3;

    public ChefNain(){
        super();
    }

    @Override
    protected void subirDegat(int degats) {
        super.subirDegat(degats/2);
    }



    @Override
    public int getRessources() {
        return RESSOURCES;
    }
}
