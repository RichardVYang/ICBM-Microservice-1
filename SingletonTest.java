package com.yang.warrior.com.yang.warrior.singleton;

/**
 * Created by richardyang on 5/28/11.
 */
public class SingletonTest {

    public static void main(String ... args) {

        SingletonTest st = new SingletonTest();
        System.out.println("----------------------------");
        st.testLoggerOne();
        System.out.println("----------------------------");
        st.testLoggerTwo();
        System.out.println("----------------------------");
        st.testLoggerThree();

    }

    private void testLoggerOne() {
       // LoggerOne one = new LoggerOne(); // Cannot do due to private constructor. Also cannot subclass due to private constructor

       LoggerOne.LOG_INSTANCE.info("InfoMessage");
       LoggerOne.LOG_INSTANCE.error("ErrorMessage");
       LoggerOne.LOG_INSTANCE.severe("SevereMessage");
       LoggerOne.LOG_INSTANCE.warning("WarningMessage");
       LoggerOne.LOG_INSTANCE.audit("AuditMessage");

    }
    private void testLoggerTwo() {
      //  LoggerTwo two = new LoggerTwo(); // Cannot do due to private constructor. Also cannot subclass due to private constructor

       LoggerTwo two = LoggerTwo.getLogInstance();
       two.allLOg("all message");


    }
    private void testLoggerThree() {

       // LoggerThree three = new LoggerThree();  // enum cannot be instantiated or subclassed because it is implicitely declared as final
       LoggerThree.LOG_INSTANCE.allLog("enum all message");

       LoggerThree.LOG_INSTANCE.audit("AuditMessage");

    }


}
