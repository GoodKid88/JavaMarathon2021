package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece kingWhite = ChessPiece.KING_WHITE;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
        ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;
        ChessPiece knightWhite = ChessPiece.KNIGHT_WHITE;
        ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece empty = ChessPiece.EMPTY;

        String[][] chessFigures = new String[8][8];
        chessFigures[0][0] = rookBlack.getIcon();
        chessFigures[0][1] = empty.getIcon();
        chessFigures[0][2] = empty.getIcon();
        chessFigures[0][3] = empty.getIcon();
        chessFigures[0][4] = empty.getIcon();
        chessFigures[0][5] = rookBlack.getIcon();
        chessFigures[0][6] = kingBlack.getIcon();
        chessFigures[0][7] = empty.getIcon();

        chessFigures[1][0] = empty.getIcon();
        chessFigures[1][1] = rookWhite.getIcon();
        chessFigures[1][2] = empty.getIcon();
        chessFigures[1][3] = empty.getIcon();
        chessFigures[1][4] = pawnBlack.getIcon();
        chessFigures[1][5] = pawnBlack.getIcon();
        chessFigures[1][6] = empty.getIcon();
        chessFigures[1][7] = pawnBlack.getIcon();

        chessFigures[2][0] = pawnBlack.getIcon();
        chessFigures[2][1] = empty.getIcon();
        chessFigures[2][2] = knightBlack.getIcon();
        chessFigures[2][3] = empty.getIcon();
        chessFigures[2][4] = empty.getIcon();
        chessFigures[2][5] = empty.getIcon();
        chessFigures[2][6] = pawnBlack.getIcon();
        chessFigures[2][7] = empty.getIcon();

        chessFigures[3][0] = queenBlack.getIcon();
        chessFigures[3][1] = empty.getIcon();
        chessFigures[3][2] = empty.getIcon();
        chessFigures[3][3] = bishopWhite.getIcon();
        chessFigures[3][4] = empty.getIcon();
        chessFigures[3][5] = empty.getIcon();
        chessFigures[3][6] = empty.getIcon();
        chessFigures[3][7] = empty.getIcon();

        chessFigures[4][0] = empty.getIcon();
        chessFigures[4][1] = empty.getIcon();
        chessFigures[4][2] = empty.getIcon();
        chessFigures[4][3] = bishopBlack.getIcon();
        chessFigures[4][4] = pawnWhite.getIcon();
        chessFigures[4][5] = empty.getIcon();
        chessFigures[4][6] = empty.getIcon();
        chessFigures[4][7] = empty.getIcon();

        chessFigures[5][0] = empty.getIcon();
        chessFigures[5][1] = empty.getIcon();
        chessFigures[5][2] = empty.getIcon();
        chessFigures[5][3] = empty.getIcon();
        chessFigures[5][4] = bishopWhite.getIcon();
        chessFigures[5][5] = pawnWhite.getIcon();
        chessFigures[5][6] = empty.getIcon();
        chessFigures[5][7] = empty.getIcon();

        chessFigures[6][0] = pawnWhite.getIcon();
        chessFigures[6][1] = empty.getIcon();
        chessFigures[6][2] = empty.getIcon();
        chessFigures[6][3] = queenWhite.getIcon();
        chessFigures[6][4] = empty.getIcon();
        chessFigures[6][5] = pawnWhite.getIcon();
        chessFigures[6][6] = empty.getIcon();
        chessFigures[6][7] = pawnWhite.getIcon();

        chessFigures[7][0] = empty.getIcon();
        chessFigures[7][1] = empty.getIcon();
        chessFigures[7][2] = empty.getIcon();
        chessFigures[7][3] = empty.getIcon();
        chessFigures[7][4] = empty.getIcon();
        chessFigures[7][5] = rookWhite.getIcon();
        chessFigures[7][6] = kingWhite.getIcon();
        chessFigures[7][7] = empty.getIcon();


        ChessBoard chessBoard = new ChessBoard(chessFigures);
        chessBoard.print();
    }
}
