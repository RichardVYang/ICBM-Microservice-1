package com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule;

import com.yang.warrior.magicsquare.RowColumn;

import java.util.*;

/**
 * Created by richardyang on 4/20/17.
 */
public class RuleManager {
  //  private HashMap<Integer, Rule> ruleEngine = new HashMap<>(10);

    private List<Rule> ruleEngine = new ArrayList<>(10);

    public RuleManager() {
        initializeAllRules();
    }

    // Register rules into the RuleManager
    private void initializeAllRules() {
        /*  for HashMap
        ruleEngine.put(1, new RuleOneImpl());
        ruleEngine.put(2, new RuleTwoImpl());
        ruleEngine.put(3, new RuleThreeImpl());
        ruleEngine.put(4, new RuleFourImpl());
        ruleEngine.put(5, new RuleFiveImpl());
        ruleEngine.put(6, new RuleSixImpl());
        ruleEngine.put(7, new RuleSevenImpl());
        ruleEngine.put(8, new RuleEightImpl());
        ruleEngine.put(9, new RuleTopRightCornerImpl());
    */
        ruleEngine.add(new RuleOneImpl());
        ruleEngine.add(new RuleTwoImpl());
        ruleEngine.add(new RuleThreeImpl());
        ruleEngine.add(new RuleFourImpl());
        ruleEngine.add(new RuleFiveImpl());
        ruleEngine.add(new RuleSixImpl());
        ruleEngine.add(new RuleSevenImpl());
        ruleEngine.add(new RuleEightImpl());
        ruleEngine.add(new RuleTopRightCornerImpl());



    }

    public RowColumn getNextPosition(RowColumn current, int size, boolean isNextOccupied) {
        RowColumn next = null;

        /* for HashMap
        for (Rule rule : ruleEngine.values()) {
            next = rule.executeRule(current, size, isNextOccupied);

            if ((next.getRow() >=0) && (next.getColumn() >= 0))
                break;
        }
        */

        for (Rule rule : ruleEngine) {
            next = rule.executeRule(current, size, isNextOccupied);
            if ((next.getRow() >=0) && (next.getColumn() >= 0))
                break;
        }

        return next;
    }

}
