package src;
import src.Modele.*;
import java.util.ArrayList;

public class Main{
public static void main(String[] args) {

    Grille m = new Grille(3,3);
    Move mo = new Move(m);

    Play play = new Play(m, mo);
    System.out.println(play.isFinished());
    play.afficheGrille();

}
}
