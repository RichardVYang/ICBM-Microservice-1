package com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule;

import com.yang.warrior.magicsquare.RowColumn;
import com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule.Rule;

/**
 * Rule one is the first rule or start rule. It returns row[1][size / 2] or the first row and mid column.
 *
 * Created by richardyang on 4/20/17.
 */
public class RuleOneImpl implements Rule {


    @Override
    public RowColumn executeRule(RowColumn c, int size, boolean isNextOccupied) {
        if ((-1 == c.getRow()) && (-1 == c.getColumn())) {
            System.out.println("Rule One succeeds - current r/c:" + c.getRow() + "/" + c.getColumn() + " next r/c:" + 0 + "/" + (size /2));
            return new RowColumn(0, size / 2);
    }
        else {
            System.out.println("Rule One fails - current r/c: "+ c.getRow() + "/" + c.getColumn());
            return new RowColumn(-3, -3);
        }
    }
}
