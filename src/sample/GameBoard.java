package sample;

public class GameBoard {
    char[][] board;
    static final int size = 3;
    public GameBoard() {
       board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                board[i][j] = '_';
            }
        }
    }

    public char[][] getBoard() {
        return board;
    }
    public void printBoard() {
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + ' ');
            }
        }
    }
}
