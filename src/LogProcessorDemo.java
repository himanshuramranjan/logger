import models.DebugLogProcessor;
import models.ErrorLogProcessor;
import models.InfoLogProcessor;
import models.LogProcessor;

public class LogProcessorDemo {
    public static void main(String[] args) {

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this ");
        logObject.log(LogProcessor.INFO, "just for info ");

    }
}