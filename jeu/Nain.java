package jeu;

public class Nain extends Guerrier{

    public Nain(){
        super();
    }

    @Override
    protected void subirDegat(int degats) {
        super.subirDegat(degats/2);
    }
}
