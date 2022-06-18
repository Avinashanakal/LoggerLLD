package LoggerUsinfCorPattern;
public class Logger {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor (new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR,"Exception");
        logProcessor.log(LogProcessor.DEBUG,"needs debugging");
        logProcessor.log(LogProcessor.INFO,"FYI");
    }
}
