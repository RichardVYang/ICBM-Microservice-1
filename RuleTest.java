package com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule;

import com.yang.warrior.magicsquare.RowColumn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by richardyang on 4/20/17.
 */
class RuleTest {
    int size = 5;

    @BeforeEach
    void setUp() {
    }
/*
    @Test
    void testRuleOne() {
        Rule ruleOne = new RuleOneImpl();
        RowColumn current = new RowColumn(-1, - 1);
        RowColumn next = ruleOne.executeRule(current, size);
        System.out.println("Current row/column: " + current.getRow() +"/" + current.getColumn() + " next: row/column: " + next.getRow() + "/" + next.getColumn());

    }
*/
/*
    @Test
    void testRulThree() {
        Rule ruleThree = new RuleThreeImpl();
        RowColumn current = new RowColumn(size, size /2 + 2);
        RowColumn next = ruleThree.executeRule(current, size, false);
        System.out.println("Current row/column: " + current.getRow() +"/" + current.getColumn() + " next: row/column: " + next.getRow() + "/" + next.getColumn());

    }
*/

    @Test
    void testRulFour() {
        Rule ruleFour = new RuleFourImpl();
        RowColumn current = new RowColumn(size-2, size-1);
        RowColumn next = ruleFour.executeRule(current, size, false);
        System.out.println("Current row/column: " + current.getRow() +"/" + current.getColumn() + " next: row/column: " + next.getRow() + "/" + next.getColumn());

    }


}