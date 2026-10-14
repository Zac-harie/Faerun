package jeu;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Chateau {
    public static final int RESSOURCES_INITIAL=3;
    public static final int RESSOURCES_AJOUTEE_PAR_TOUR=1;
    private int ressources;
    private Couleur couleur;
    private List<Guerrier> guerriersNovices, guerrierEntraines;

    public Chateau(Couleur couleur){
        this.couleur=couleur;
        ressources=RESSOURCES_INITIAL;
        this.guerriersNovices=new LinkedList<>();
        this.guerrierEntraines=new LinkedList<>();
    }

    public void ajoutGuerrierNovice(Guerrier guerrier){
        guerriersNovices.add(guerrier);
        guerrier.setChateau(this);
    }

    public Collection<Guerrier> getGuerriersNovices(){return guerriersNovices;}

    public Collection<Guerrier> entrainer(){

        while(guerriersNovices.getFirst().getRessources()<=guerriersNovices.getFirst().getChateau().ressources){
            guerrierEntraines.add(guerriersNovices.getFirst());
            ressources-=guerriersNovices.getFirst().getRessources();
            guerriersNovices.removeFirst();
        }
        incrementerRessources();
        return guerrierEntraines;
    }

    private void incrementerRessources(){ressources+=RESSOURCES_AJOUTEE_PAR_TOUR;}

    public Couleur getCouleur(){return couleur;}

    public boolean estBleu(){return couleur==Couleur.BLEU;}

    public boolean estRouge(){return couleur==Couleur.ROUGE;}
}
