package com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule;

import com.yang.warrior.magicsquare.RowColumn;

/**
 * Created by richardyang on 4/20/17.
 */
public interface Rule {
    public RowColumn executeRule(RowColumn curRowColumn, int size, boolean isNextOccupied);

}
