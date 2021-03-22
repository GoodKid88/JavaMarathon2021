package day17;

public class ChessBoard {
    private static String[][] chessFigures;

    public ChessBoard(String[][] chessFigures) {
        this.chessFigures = chessFigures;
    }

    void print() {
        for (int i = 0; i < chessFigures.length; i++) {
            for (int j = 0; j < chessFigures.length; j++) {
                System.out.print(chessFigures[i][j]);
            }
            System.out.println();
        }
    }
}
