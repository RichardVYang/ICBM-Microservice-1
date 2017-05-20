package com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule;

import com.yang.warrior.magicsquare.RowColumn;

/**
 * Created by richardyang on 4/20/17.
 */
public class RuleFourImpl implements Rule {
    @Override
    public RowColumn executeRule(RowColumn c, int size, boolean isNextOccupied) {
        if (((c.getRow() - 1) >= 0) && (c.getColumn() == (size -1))) {
            System.out.println("Rule Four succeeds - current r/c:" + c.getRow() + "/" + c.getColumn() + " next r/c:" + (c.getRow() - 1) + "/" + (size - size));
            return new RowColumn(c.getRow() - 1, size - size);
        }
        else {
            System.out.println("Rule Four fails - current r/c: "+ c.getRow() + "/" + c.getColumn());
            return new RowColumn(-3, -3);
        }
    }
}
