package com.rrayor.data;

public final class GameStates {
    // Each cell is represented by 3 bits
    // The first bit represents the cell being empty if set to 1
    // The second bit represents the cell being occupied by X if set to 1
    // The third bit represents the cell being occupied by O if set to 1

    private GameStates() {}

    // Because each cell is represented by 3 bits, 1 byte can represent 2 cells
    public static final byte BYTES_PER_ROW = 2;

    public static final byte[] X_WIN = { 0b00010010, 0b00000010 };
    public static final byte[] O_WIN = { 0b00001001, 0b00000001 };

    public static final byte[] X_TOP_ROW_WIN = {
            0b00010010, 0b00000010, // X X X
            0b00001010, 0b00000100, // O X N
            0b00010001, 0b00000001  // X O O
    };

    public static final byte[] X_LEFT_COL_WIN = {
            0b00010100, 0b00000001, // X N O
            0b00010010, 0b00000100, // X X N
            0b00010001, 0b00000001  // X O O
    };
}
