package com.yang.warrior.magicsquare;

import com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule.Rule;
import com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule.RuleOneImpl;
import com.yang.warrior.magicsquare.com.yang.warrior.magicsquare.rule.RuleTwoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by richardyang on 4/20/17.
 */
public class MagicSquareMain {

    public static void main(String ...args) {
        // Could allow the user to enter the magic square size from the command line
        int size = 11; // magic square size must be odd number, ie, 3, 5, 7, 9, 11, 13, etc.
        MagicSquareMain msm = new MagicSquareMain();
        msm.start(size);

    }
    public void start(int size) {

        MagicSquare ms = new MagicSquare(size);
        ms.start();
     //   ms.displaySquareInProgress();
      //  testingRules();

    }

    public void testingRules() {
        HashMap<Integer, Rule> ruleEngine = new HashMap<>();
        List<Rule> listRuleEngine = new ArrayList<>();

        Rule ruleOne = new RuleOneImpl();
        Rule ruleTwo = new RuleTwoImpl();

        ruleEngine.put(1, ruleOne);
        ruleEngine.put(2, ruleTwo);

        Rule nextRule = ruleEngine.get(1);
        nextRule.executeRule(new RowColumn(2,3), 5, false);

        nextRule = ruleEngine.get(2);
        nextRule.executeRule(new RowColumn(5, 6), 5, false);

        //------------

        listRuleEngine.add(ruleOne);
        listRuleEngine.add(ruleTwo);


    }


}
