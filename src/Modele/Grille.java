package src.Modele;

public class Grille{

private int n;
private int m;
private Integer[][] grille;

public Grille(int n, int m){
  this.n = n;
  this.m = m;
  this.grille = new Integer[n][m];
  this.initGrille();
}
public Integer[][] getGrille(){
  return grille;
}

public void initGrille(){
  int cmp = 1;
  for (int i = 0; i < this.n; i++){
    for (int j = 0; j < this.m; j++){
      grille[i][j] = cmp;
      cmp+=1;
    }
  }
  grille[n-1][m-1] = 0;
}

public void afficheGrille(){
  for (int i = 0; i < this.n; i++){
    for (int j = 0; j < this.m; j++){
      System.out.print(grille[i][j]);
    }
    System.out.println("");
  }
}

public void setValue(Integer k, int i, int j){
  grille[i][j] = k;
}

public int getN(){
return this.n;
}

public int getM(){
  return this.m;
}

public void setN(int n){
  this.n = n;
}

public void setM(int m){
  this.m = m;
}
}
