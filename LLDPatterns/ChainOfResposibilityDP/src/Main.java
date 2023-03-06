public class Main {
    public static void main(String[] args) {
        LogHandler logHandler = new InfoLogHandler(new DebugLogHandler(new ErrorLogHandler(null)));
        logHandler.log(3,"Exception Occurs");
        logHandler.log(2,"Need to Debug this");
        logHandler.log(1,"Just for Information");
    }
}