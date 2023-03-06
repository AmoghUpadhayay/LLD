public class DebugLogHandler extends LogHandler{

    public DebugLogHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("DEBUG: "+ message);
        } else{
            super.log(logLevel,message);
        }
    }
}
