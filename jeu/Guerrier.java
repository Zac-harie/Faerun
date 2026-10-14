package jeu;

public abstract class Guerrier {

    //Variables et constantes
    public static final int FORCE_BASE=10;
    public static final int PV_MAX_BASE=100;
    public static final int RESSOURCE_BASE=1;
    private int pointsDeVie;
    private Chateau chateau;

    //Constructeur
    public Guerrier(){
        pointsDeVie=PV_MAX_BASE;
    }

    //Getter et Setter
    public int getForce() { return FORCE_BASE; }

    public int getPointsDeVie() { return pointsDeVie; }

    public int getRessources(){return RESSOURCE_BASE;}

    public Couleur getCouleur(){return chateau.getCouleur();}

    public Chateau getChateau(){return chateau;}

    public void setPointsDeVie(int pv) { pointsDeVie = pv; }

    public void setChateau(Chateau chateau){this.chateau=chateau;}

    //Vrai si guerrier vivant, faux sinon
    public boolean estVivant(){return pointsDeVie>0;}

    public boolean estBleu(){return chateau.estBleu();}

    public boolean estRouge(){return chateau.estRouge();}

    //Calcul des dégats infligés à un autre guerrier
    public void attaquer(Guerrier oGuerrier){
        int attack = GuerrierUtil.de3(getForce());
        System.out.println("Le "+this.getClass().getSimpleName()+" inflige "+attack+" de dégats.");
        oGuerrier.subirDegat(attack);
    }

    //Calcul des points de vie restants après avoir subi une attaque
    protected void subirDegat(int degats){
        System.out.println("Le "+this.getClass().getSimpleName()+" subit "+degats+" dégats.");
        if(pointsDeVie-degats<=0){
            setPointsDeVie(0);
        }else {
            setPointsDeVie(pointsDeVie-degats);
        }

    }
}
