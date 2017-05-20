package com.yang.warrior.magicsquare;

/**
 * Created by richardyang on 4/20/17.
 */
public class RowColumn {

    private int row = 0;
    private int column = 0;

    public RowColumn(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }


}
