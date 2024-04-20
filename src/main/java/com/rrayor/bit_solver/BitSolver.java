package com.rrayor.bit_solver;

import com.rrayor.data.GameStates;

public final class BitSolver {

    private BitSolver() {}

    public static void solve(byte[] gameStates) {

         // Solve rows
        for (int i = 0; i < gameStates.length; i += GameStates.BYTES_PER_ROW) {
            byte first2Cells = gameStates[i];
            byte lastCellAndPadding = gameStates[i + 1];

            if ((first2Cells & GameStates.X_WIN[0]) == GameStates.X_WIN[0] && (lastCellAndPadding & GameStates.X_WIN[1]) == GameStates.X_WIN[1]) {
                System.out.println("X wins");
                return;
            } else if ((first2Cells & GameStates.O_WIN[0]) == GameStates.O_WIN[0] && (lastCellAndPadding & GameStates.O_WIN[1]) == GameStates.O_WIN[1]) {
                System.out.println("O wins");
                return;
            }
        }

        // TODO: Solve columns
        // TODO: Solve diagonals

        System.out.println("No winner");
    }
}
