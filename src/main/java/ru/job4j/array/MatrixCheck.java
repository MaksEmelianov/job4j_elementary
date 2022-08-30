package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        for (int cell = 0; cell < board.length; cell++) {
            if ('X' != (board[row][cell])) {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            if ('X' != (board[row][column])) {
                return false;
            }
        }
        return true;
    }
}
