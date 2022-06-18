package LoggerUsinfCorPattern;

public abstract class LogProcessor {
    public static int INFO =1;
    public static int DEBUG =2;
    public static int ERROR =3;

    LogProcessor nextLoggerprocessor;

    LogProcessor(LogProcessor logProcessor){
        this.nextLoggerprocessor= logProcessor;
    }

    public void log(int logLevel, String message){
        if(nextLoggerprocessor != null){
            nextLoggerprocessor.log(logLevel,message);
        }
    }
}
