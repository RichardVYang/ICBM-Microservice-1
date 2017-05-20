package com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule;

import com.yang.warrior.magicsquare.RowColumn;

/**
 * Created by richardyang on 4/21/17.
 */
public class RuleTopRightCornerImpl implements Rule {
    @Override
    public RowColumn executeRule(RowColumn c, int size, boolean isNextOccupied) {
        if (0 == c.getRow() && (c.getColumn() == (size - 1))) {
            System.out.println("Rule TopRightCorner succeeds - current r/c:" + c.getRow() + "/" + c.getColumn() + " next r/c:" + (c.getRow() + 1) + "/" + c.getColumn());
            return new RowColumn(c.getRow() + 1, c.getColumn());
        }
        else {
            System.out.println("Rule TopRightCorner fails - current r/c: "+ c.getRow() + "/" + c.getColumn());
            return new RowColumn(-3, -3);
        }
    }
}
