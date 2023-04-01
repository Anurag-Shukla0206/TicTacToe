// package TicTacToe;
import java.util.*;

public class Main {
    public static void main(String []args) {
        Scanner scn = new Scanner(System.in);

        Player A = new Player();
        A.setName(scn.next());
        A.setSymbol('0');
        Player B = new Player();
        B.setName(scn.next());
        B.setSymbol('X');


        Player [] players = {A,B};

        Board board = new Board(3);
        Game game = new Game(players, board);
       
        game.play();
    }
}
