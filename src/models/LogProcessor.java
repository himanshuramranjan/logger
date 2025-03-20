package models;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 1;
    public static int ERROR = 1;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor loggerProcessor) {
        this.nextLogProcessor = loggerProcessor;
    }

    public void log(int logLevel, String message) {
        if(nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}
