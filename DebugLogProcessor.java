package LoggerUsinfCorPattern;

import sun.rmi.runtime.Log;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int level, String message){
        if (level ==DEBUG){
            System.out.println("Degbug: "+message);
        }
        else{
            super.log(level,message);
        }
    }
}
