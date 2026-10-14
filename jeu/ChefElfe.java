package jeu;

public class ChefElfe extends Elfe{

    public static final int RESSOURCES=4;

    public ChefElfe(){
        super();
    }

    @Override
    public int getForce(){return super.getForce()*2;}

    @Override
    public int getRessources() {
        return RESSOURCES;
    }
}
