package source;
import java.util.ArrayList;

public class Move{

private Modele m;
private String dir;
private Integer element;

public Move(Modele etat, Integer element, String dir){
  this.m = etat;
  this.element = element;
  this.dir = dir;
}

//TODO
//public void mouvement(){
	
	
	
	
	
//}

public void afficheEtat(){
  for (int i =0; i< m.getN(); i++){
    for (int j = 0; j < m.getM(); j++){
      System.out.println(m.getGrille()[i][j]);
    }
  }
}

private boolean valideDonnee(int xTab, int yTab) {
        if(xTab<0 || xTab>=m.getGrille().length) return false;
        return !(yTab<0 || yTab>=m.getGrille()[0].length);
    }

public ArrayList<Integer> Voisin(int xTab, int yTab) {
		ArrayList<Integer> lis = new ArrayList<Integer>();
        for(int y=yTab-1; y<=yTab+1; y++){
            for(int x=xTab-1; x<=xTab+1; x++){
				// fonction logique pour récuperer les voisins POSSIBLES avec un repère orthonormé.
                if((x!=xTab || y!=yTab) && (x==xTab-1 && y==yTab) || (x==xTab+1 && y==yTab) || (x==xTab && y==yTab-1) || (x==xTab && y==yTab+1))
                    if (afficheDonnee(x,y) != -1){
                    lis.add(afficheDonnee(x,y));
					}
    }}
    return lis;
    }
     
    private Integer afficheDonnee(int xTab, int yTab) {
        if(valideDonnee(xTab, yTab)){
            return m.getGrille()[xTab][yTab];
		}
		return -1;
    }
    
    public void toStringVoisin(ArrayList<Integer> liste){
		for (int i =0; i < liste.size(); i++){
			System.out.println(liste.get(i));
			}
		}
}
