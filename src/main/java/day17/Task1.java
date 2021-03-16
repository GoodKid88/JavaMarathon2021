package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;

        String array[] = new String[8];

        for (int i = 0; i < 4; i++) {
            array[i] = pawnWhite.getIcon();
            System.out.print(array[i] + " ");
        }
        for (int i = 4; i < array.length; i++) {
            array[i] = rookBlack.getIcon();
            System.out.print(array[i] + " ");
        }

    }
}