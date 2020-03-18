package src.Modele;
import java.util.Random;

public class Play extends AbstractModeleEcoutable{

    private Grille grille;
    private Move move;

    public Play(Grille grille, Move move){
        this.grille = grille;
        this.move = move;
    }
    
    public void Shuffle(){
		
		Random rand = new Random();
		
		for (int i = 0; i < grille.getN(); i++){
			for (int j =0; j < grille.getM(); j++){
				this.grille.getGrille()[i][j] = rand.nextInt(((grille.getN() * grille.getM()) - 1) - 1 + 1) + 1;
				}
			}
		
		this.grille.getGrille()[grille.getN() -1][grille.getM() -1] = 0;
		
		}
		
	public void afficheGrille(){
	for (int i = 0; i < this.grille.getN(); i++){
		for (int j = 0; j < this.grille.getM(); j++){
			System.out.print(this.grille.getGrille()[i][j]);
			}
    System.out.println("");
		}
	}
	
	public Integer[][] grilleInit(){
		Integer[][] grilleInit = new Integer[this.grille.getN()][this.grille.getM()];
		
		int cmp = 1;
		for (int i = 0; i < this.grille.getN(); i++){
			for (int j = 0; j < this.grille.getM(); j++){
				grilleInit[i][j] = cmp;
		cmp+=1;
			}
		}
		grilleInit[this.grille.getN()-1][this.grille.getM()-1] = 0;
		
		return grilleInit;
		
		}
	
	
	public boolean isFinished(){

		int tmp = 0;
		
		for (int i = 0; i < this.grille.getN(); i++){
			for (int j =0; j < this.grille.getM(); j++){
				
				if (grilleInit()[i][j] == grille.getGrille()[i][j]){
					tmp += 1;
					}
				}
			}

		if (tmp == this.grille.getN() * this.grille.getM()){ return true;}
		else{
			return false;
			}
		}
    
}
