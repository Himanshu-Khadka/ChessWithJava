package himanshukhadka.chess;

/**
 *
 */
public class PieceMoves {
    public static boolean isValidMove(char piece, int startRow, int startCol, int endRow, int endCol, char[][] board){
        switch (piece){
            case 'P':
                return pawnMove(startRow, startCol, endRow, endCol, board);
            case 'R':
                return rookMove(startRow, startCol, endRow, endCol, board);
            case 'N':
                return knightMove(startRow, startCol, endRow, endCol, board);
            case 'B':
                return bishopMove(startRow, startCol, endRow, endCol, board);
            case 'Q':
                return queenMove(startRow, startCol, endRow, endCol, board);
            case 'K':
                return kingMove(startRow, startCol, endRow, endCol, board);
            default:
                return false;
        }
    }

    private static boolean pawnMove(int startRow, int startCol, int endRow, int endCol, char[][] board){
        return false;
    }

    private static boolean rookMove(int startRow, int startCol, int endRow, int endCol, char[][] board){
        return false;
    }

    private static boolean knightMove(int startRow, int startCol, int endRow, int endCol, char[][] board){
        return false;
    }

    private static boolean bishopMove(int startRow, int startCol, int endRow, int endCol, char[][] board){
        return false;
    }

    private static boolean queenMove(int startRow, int startCol, int endRow, int endCol, char[][] board){
        return false;
    }

    private static boolean kingMove(int startRow, int startCol, int endRow, int endCol, char[][] board){
        return false;
    }
}
