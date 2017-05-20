package com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule;

import com.yang.warrior.magicsquare.RowColumn;
import com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule.Rule;

/**
 * Created by richardyang on 4/20/17.
 */
public class RuleTwoImpl implements Rule {
    @Override
    public RowColumn executeRule(RowColumn c, int size, boolean isNextOccupied) {
        if ((0 == c.getRow()) && ((size / 2) == c.getColumn())) {
            System.out.println("Rule Two succeeds - current r/c:" + c.getRow() + "/" + c.getColumn() + " next r/c:" + (size - 1) + "/" + c.getColumn() + 1);
            return new RowColumn(size - 1, c.getColumn() + 1);
        }
        else {
            System.out.println("Rule Two fails - current r/c: "+ c.getRow() + "/" + c.getColumn());
            return new RowColumn(-3, -3);
        }
    }
}
