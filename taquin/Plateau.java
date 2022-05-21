package taquin;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Plateau {

  protected ArrayList<ArrayList<Piece>> tableau;
  protected int largeur;
  protected int hauteur;

  public Plateau(ArrayList<Piece> pieces, int largeur, int hauteur){
    this.tableau = new ArrayList<ArrayList<Piece>>();
    Piece p0 = pieces.get(pieces.size()-1);
    pieces.remove(pieces.size()-1);
    Collections.shuffle(pieces);
    pieces.add(p0);
    int co = 0;
    for (int i = 0; i < hauteur; i++){
      this.tableau.add(new ArrayList<Piece>());
      for (int j = 0; j < largeur; j++) {
        this.tableau.get(i).add(pieces.get(co));
        co++;
      }
    }
    this.largeur = largeur;
    this.hauteur = hauteur;
  }

  public ArrayList<ArrayList<Piece>> getTableau(){
    return this.tableau;
  }

  @Override
  public String toString() {/*Override la mise en String pour en faire une adaptee a Plateau*/
    String strPlateau = "";
    for (int i = 0; i < this.tableau.size(); i++){
      for (int j = 0; j < this.tableau.get(0).size(); j++) {
        strPlateau = strPlateau + " " + this.tableau.get(i).get(j).getId();
      }
      strPlateau = strPlateau + "\n";
    }
   return strPlateau;
  }
}
