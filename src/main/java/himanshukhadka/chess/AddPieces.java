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
        for (int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                ImageView piece = new ImageView();
                piece.setFitHeight(200);
                piece.setFitWidth(200);
                switch (board[i][j]){
                    case 'K':
                        piece.setImage(whiteKing);
                        break;
                    case 'k':
                        piece.setImage(blackKing);
                        break;
                    case 'Q':
                        piece.setImage(whiteQueen);
                        break;
                    case 'q':
                        piece.setImage(blackQueen);
                        break;
                    case 'R':
                        piece.setImage(whiteRook);
                        break;
                    case 'r':
                        piece.setImage(blackRook);
                        break;
                    case 'B':
                        piece.setImage(whiteBishop);
                        break;
                    case 'b':
                        piece.setImage(blackBishop);
                        break;
                    case 'N':
                        piece.setImage(whiteKnight);
                        break;
                    case 'n':
                        piece.setImage(blackKnight);
                        break;
                    case 'P':
                        piece.setImage(whitePawn);
                        break;
                    case 'p':
                        piece.setImage(blackPawn);
                        break;
                    default:
                        continue;
                }
                pane.add(piece, j, i);
            }
        }



    }
}
