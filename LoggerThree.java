package com.yang.warrior.com.yang.warrior.singleton;

/**
 * Created by richardyang on 5/28/11.
 */
public enum LoggerThree {
    LOG_INSTANCE;

    // This no-argument constructor will be provided if developer does not provide any constructor.
    LoggerThree() {
        System.out.println("LoggerThree::LoggerThree() default construction is initializing...");
    }

    public void allLog(String message) {
        System.out.println(message);
    }

    public static void audit(String auditMessage) {
        System.out.println("Audit " + auditMessage);
    }

}
