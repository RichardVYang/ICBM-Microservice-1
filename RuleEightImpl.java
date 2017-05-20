package com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule;

import com.yang.warrior.magicsquare.RowColumn;

/**
 * Created by richardyang on 4/21/17.
 */
public class RuleEightImpl implements Rule {
    @Override
    public RowColumn executeRule(RowColumn c, int size, boolean isNextOccupied) {
        if (0 == c.getRow() && (c.getColumn() < size - 1)) {
            System.out.println("Rule Eight succeeds - current r/c:" + c.getRow() + "/" + c.getColumn() + " next r/c:" + (size -1) + "/" + c.getColumn() + 1);
            return new RowColumn(size - 1, c.getColumn() + 1);
        }
        else {
            System.out.println("Rule Eight fails - current r/c: "+ c.getRow() + "/" + c.getColumn());
            return new RowColumn(-3, -3);
        }
    }
}
