package source;

public class Main{
public static void main(String[] args) {

    Modele m = new Modele(3,3);
    m.afficheGrille();
    Move mo = new Move(m, 8, "droite");
    mo.Collision();
    m.afficheGrille();
}
}
