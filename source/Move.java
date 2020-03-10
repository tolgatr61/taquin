package source;

public class Move{

private Modele m;
private String dir;
private Integer element;

public Move(Modele etat, Integer element, String dir){
  this.m = etat;
  this.element = element;
  this.dir = dir;
}

public void Collision(){

  for (int i = 0; i < m.getN(); i++){
    for (int j = 0; j < m.getM(); j++){
      //recherche du zéro dans la m.getGrille()

      if (m.getGrille()[i][j] == this.element){
        /*
        if (m.getGrille()[i+1][j] == 0 && m.getGrille()[i+1][j] != null){
          m.getGrille()[i+1][j] = n;
          m.getGrille()[i][j] = 0;
        }

        if (m.getGrille()[i-1][j] ==0 && m.getGrille()[i-1][j] != null){
          m.getGrille()[i-1][j] = n;
          m.getGrille()[i][j] = 0;
        }

        if (m.getGrille()[i][j-1] == 0 && m.getGrille()[i][j-1] != null){
          m.getGrille()[i][j-1] = n;
          m.getGrille()[i][j] = 0;

        }
*/
        if (m.getGrille()[i][j+1] == 0 && m.getGrille()[i][j+1] != null){
          System.out.println(i);
          m.getGrille()[i][j] = 0;
          System.out.println(j+1);
          m.getGrille()[i][j+1] = this.element;
        }
      else continue;
        }
      }
    }
  }

public void afficheEtat(){
  for (int i =0; i< m.getN(); i++){
    for (int j = 0; j < m.getM(); j++){
      System.out.println(m.getGrille()[i][j]);
    }
  }
}

}
