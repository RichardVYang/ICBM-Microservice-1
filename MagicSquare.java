package com.yang.warrior.magicsquare;


import com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule.RuleManager;

/**
 * Created by richardyang on 4/20/17.
 */
public class MagicSquare {

    private int size;
    private int square[][];


    private RowColumn currentPosition = new RowColumn(-1, -1);
    private RowColumn newPosition = new RowColumn(-1, -1);

    public MagicSquare(int size) {
        this.size = size;
        square = new int[size][size];
        initializeSquare(square, size);
    }

    public void initializeSquare(int square[][], int size) {
        for (int row = 0; row < size; row++)
            for (int column = 0; column < size; column++)
                square[row][column] = 0;
    }

    public void displaySquareInProgress() {
        int formatLeng = Integer.toString(size * size).length() + 1;
        String formatData = "%1$"+formatLeng+"d";

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                String result = String.format(formatData, square[row][column]);
                System.out.print(result);
            }
            System.out.println();
        }
    }

    private void displayColumnSum(int[][] magicSquare, int magicSize) {
        int formatLeng = Integer.toString(magicSize * magicSize).length() + 2;
        String formatData = "%1$"+formatLeng+"d";

        System.out.println("   ====");
        for (int column = 0; column < magicSize; column++) {
            int rowSum = 0;
            for (int row = 0; row < magicSize; row++) {
                rowSum = rowSum + magicSquare[row][column];
            }
            //  String result = String.format("%1$4d", rowSum);
            String result = String.format(formatData, rowSum);
            System.out.print(result);
        }
        System.out.println();

    }

    private void displayDiagonalSum(int[][] magicSquare, int magicSize) {
        // sum both diagonal data
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int d = 0; d < magicSize; d++) {
            leftDiagonalSum = leftDiagonalSum + magicSquare[d][d];
            rightDiagonalSum = rightDiagonalSum + magicSquare[(magicSize - 1) - d][d];
        }

        String leftDiag = String.format("Sum of left diagonal: %1$d.", leftDiagonalSum);
        String rightDiag = String.format("Sum of right diagonal: %1$d.", rightDiagonalSum);
        System.out.println(leftDiag + "  " + rightDiag);
    }

    private void displayMagicSquareWithRowSum(int[][] magicSquare, int magicSize) {
        int formatLeng = Integer.toString(magicSize * magicSize).length() + 1;
        String formatData = "%1$"+formatLeng+"d";

        for (int row = 0; row < magicSize; row++) {
            int columnSum = 0;
            for (int column = 0; column < magicSize; column++) {
                columnSum = columnSum + magicSquare[row][column];
                //   String result = String.format("%1$4d", magicSquare[row][column]);
                String result = String.format(formatData, magicSquare[row][column]);
                System.out.print(result);
            }
            System.out.println("  = " + columnSum);
        }
    }

    private void displayMagicSquareResult(int[][] magicSquare, int magicSize) {
        displayMagicSquareWithRowSum(magicSquare, magicSize);
        displayColumnSum(magicSquare, magicSize);
        displayDiagonalSum(magicSquare, magicSize);
    }

    public void start() {
        RuleManager ruleManager = new RuleManager();
        boolean isNextPositionOccupied = false;
         int maxNumber = size * size;

        for (int magicNumber = 1; magicNumber <= maxNumber; magicNumber++) {

                newPosition = ruleManager.getNextPosition(currentPosition, size, isNextPositionOccupied);

                int row = newPosition.getRow();
                int column = newPosition.getColumn();

                if (((row >= 0) && (column >= 0)) && (row <= size - 1) && (column <= size - 1)) {
                    square[row][column] = magicNumber;
                    currentPosition = newPosition;

                    if (((row > 0) && (column < size - 1)) && (square[row-1][column + 1] > 0))
                        isNextPositionOccupied = true;
                    else
                        isNextPositionOccupied = false;

                } else {
                    System.out.println("Encounter invalid row/column number outside the square magic row and column...");
            }

            displaySquareInProgress();
            System.out.println("---------------------------");
        }

        System.out.println("************* Below is your official magic square! *****************\n");
        displayMagicSquareResult(square, size);

    }


}
