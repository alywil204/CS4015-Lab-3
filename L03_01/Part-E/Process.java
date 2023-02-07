public class Process implements Runnable {
    private String logFile;
    private int processId;

    public Process(String logFile, int processId) {
        this.logFile = logFile;
        this.processId = processId;
    }

    public void run() {
        Logger logger = Logger.getLogger(logFile);
        logger.write("Process " + processId + " using logger: " + logger.toString());
    }
}