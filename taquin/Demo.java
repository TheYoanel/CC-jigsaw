package taquin;

import java.util.List;
import java.util.ArrayList;

public class Demo {
  public static void main(String [] args) {
    ArrayList<Piece> pieces = new ArrayList<Piece>();
    pieces.add(new Piece(1));
    pieces.add(new Piece(2));
    pieces.add(new Piece(3));
    pieces.add(new Piece(4));
    pieces.add(new Piece(5));
    pieces.add(new Piece(0));

    Plateau plateau = new Plateau(pieces, 3, 2);
    System.out.println(plateau.toString());
  }
}
