package src;
import src.Modele.*;
import java.util.ArrayList;

public class Main{
public static void main(String[] args) {

    Grille m = new Grille(3,3);
    m.afficheGrille();
    Move mo = new Move(m, 4);
    m.setValue(0, 1,1);
    mo.Mouvement();
    m.afficheGrille();

}
}
