package com.yang.warrior.com.yang.warrior.singleton;

/**
 * Created by richardyang on 5/28/11.
 */
public class LoggerTwo {
    private static final LoggerTwo LOG_INSTANCE = new LoggerTwo();

    // This no-argument constructor will be provided if developer does not provide any constructor.
    private LoggerTwo() {

        System.out.println("LoggerTwo::LoggerTwo() default construction is initializing...");
    }

    public static LoggerTwo getLogInstance() { return LOG_INSTANCE; }

    public void allLOg(String logMessage) {
        System.out.println(logMessage);
    }

}
