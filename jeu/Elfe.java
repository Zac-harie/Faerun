package jeu;

public class Elfe extends Guerrier{

    public static final int RESSOURCES=2;

    public Elfe(){
        super();
    }

    @Override
    public int getForce(){return super.getForce()*2;}

    @Override
    public int getRessources() {
        return RESSOURCES;
    }
}
