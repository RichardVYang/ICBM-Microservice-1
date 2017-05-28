package com.yang.warrior.com.yang.warrior.singleton;

/**
 * Created by richardyang on 5/28/11.
 */
public class LoggerOne {
    public static final LoggerOne LOG_INSTANCE = new LoggerOne();

    // This no-argument constructor will be provided if developer does not provide any constructor.
    private LoggerOne() {
        System.out.println("LoggerOne::Loggerone() default construction is initializing...");

    }

    private void allLog(String message) {
        System.out.println(message);
    }


    public void info(String infoMessage) {
        LOG_INSTANCE.allLog( "Info " + infoMessage);
    }

    public void warning(String warningMessage) {
        LOG_INSTANCE.allLog("Warning " + warningMessage);
    }

    public void error(String errorMessage) {
        LOG_INSTANCE.allLog("Error " + errorMessage);
    }

    public void severe(String severeMessage) {
        LOG_INSTANCE.allLog("Severe " + severeMessage);
    }


    public static void audit(String auditMessage) {
        LOG_INSTANCE.allLog("Audit " + auditMessage);
    }


}

