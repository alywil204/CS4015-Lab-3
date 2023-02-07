import java.util.HashMap;

public class Logger {
    private final static HashMap<String, Logger> loggers = new HashMap<String, Logger>();
    
    private final String fileName;

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public static Logger getLogger(String filename) {
        Logger logger = Logger.loggers.get(filename);
        if (logger == null) {
            logger = new Logger(filename);
            loggers.put(filename, logger);
        }
        return logger;
    }

    public void write(String message) {
        System.out.println("Logging: \"" + message + "\" to " + this.fileName);
    }
}
