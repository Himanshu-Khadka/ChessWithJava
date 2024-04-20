package himanshukhadka.chess;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * King - 1 per player
 * Queen - 1 per player
 * Rooks (sometimes called Castles) - 2 per player
 * Bishops - 2 per player
 * Knights - 2 per player
 * Pawns - 8 per player
 */

public class AddPieces {
    public static void addPieces(GridPane pane, char[][] board){

        //Setting up pieces
        Image blackKing = new Image("https://upload.wikimedia.org/wikipedia/commons/e/e3/Chess_kdt60.png");
        Image whiteKing = new Image("https://upload.wikimedia.org/wikipedia/commons/3/3b/Chess_klt60.png");
        Image blackQueen = new Image("https://upload.wikimedia.org/wikipedia/commons/a/af/Chess_qdt60.png");
        Image whiteQueen = new Image("https://upload.wikimedia.org/wikipedia/commons/4/49/Chess_qlt60.png");
        Image blackRook = new Image("https://upload.wikimedia.org/wikipedia/commons/a/a0/Chess_rdt60.png");
        Image whiteRook = new Image("https://upload.wikimedia.org/wikipedia/commons/5/5c/Chess_rlt60.png");
        Image blackBishop = new Image("https://upload.wikimedia.org/wikipedia/commons/8/81/Chess_bdt60.png");
        Image whiteBishop = new Image("https://upload.wikimedia.org/wikipedia/commons/9/9b/Chess_blt60.png");
        Image blackKnight = new Image("https://upload.wikimedia.org/wikipedia/commons/f/f1/Chess_ndt60.png");
        Image whiteKnight = new Image("https://upload.wikimedia.org/wikipedia/commons/2/28/Chess_nlt60.png");
        Image blackPawn = new Image("https://upload.wikimedia.org/wikipedia/commons/c/cd/Chess_pdt60.png");
        Image whitePawn = new Image("https://upload.wikimedia.org/wikipedia/commons/0/04/Chess_plt60.png");

        //Adding pieces to the board and aligning them in center
        for(int i = 0;i<8;i++){
            for (int j = 0;j<8;j++){
                if (i==0){
                    if (j==0 || j==7){
                        pane.add(new ImageView(blackRook),j,i);
                        board[i][j] = 'R';
                    }
                    else if (j==1 || j==6){
                        pane.add(new ImageView(blackKnight),j,i);
                        board[i][j] = 'N';
                    }
                    else if (j==2 || j==5){
                        pane.add(new ImageView(blackBishop),j,i);
                        board[i][j] = 'B';
                    }
                    else if (j==3){
                        pane.add(new ImageView(blackQueen),j,i);
                        board[i][j] = 'Q';
                    }
                    else if (j==4){
                        pane.add(new ImageView(blackKing),j,i);
                        board[i][j] = 'K';
                    }
                }
                else if (i==1){
                    pane.add(new ImageView(blackPawn),j,i);
                    board[i][j] = 'P';
                }
                else if (i==6){
                    pane.add(new ImageView(whitePawn),j,i);
                    board[i][j] = 'p';
                }
                else if (i==7){
                    if (j==0 || j==7){
                        pane.add(new ImageView(whiteRook),j,i);
                        board[i][j] = 'r';
                    }
                    else if (j==1 || j==6){
                        pane.add(new ImageView(whiteKnight),j,i);
                        board[i][j] = 'n';
                    }
                    else if (j==2 || j==5){
                        pane.add(new ImageView(whiteBishop),j,i);
                        board[i][j] = 'b';
                    }
                    else if (j==3){
                        pane.add(new ImageView(whiteQueen),j,i);
                        board[i][j] = 'q';
                    }
                    else if (j==4){
                        pane.add(new ImageView(whiteKing),j,i);
                        board[i][j] = 'k';
                    }
                }
            }
        }



    }
}
