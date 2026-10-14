package jeu;

public class GuerrierTest3 {
    public static void main(String[] args) {
        Chateau chateau = new Chateau(Couleur.ROUGE);

        chateau.ajoutGuerrierNovice(new Nain());
        chateau.ajoutGuerrierNovice(new Nain());
        chateau.ajoutGuerrierNovice(new Elfe());
        chateau.ajoutGuerrierNovice(new Elfe());

        for (int i = 0; i < 3; i++) {
            System.out.println(chateau.entrainer());
        }
    }
}
