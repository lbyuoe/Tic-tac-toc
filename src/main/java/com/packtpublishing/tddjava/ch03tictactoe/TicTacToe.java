package com.packtpublishing.tddjava.ch03tictactoe;

public class TicTacToe {

    private Character[][] board = {{null, null, null}, {null, null, null}, {null, null, null}};

    public void play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        setBox(x, y);
    }

    public void checkAxis(int axis) {
        if (axis < 1 || axis > 3) {
            throw new RuntimeException(("X is outside board"));
        }
    }

    public void setBox(int x, int y) {
        if(board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Box is occupied");
        } else {
            board[x - 1][y - 1] = 'X';
        }
    }
}