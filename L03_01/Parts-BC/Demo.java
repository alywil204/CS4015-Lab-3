public class Demo {
    public static void main(String[] args) {
        final String logFile = "bank.log";
        Demo.withdraw(logFile);
        Demo.deposit(logFile);
        Demo.transfer(logFile);

        Demo.withdraw("suspcioustransaction.log");
    }

    public static void withdraw(String logFile) {
        final Logger logger = Logger.getLogger(logFile);
        logger.write("Processed withdrawal (" + logger.toString() + ")");
    }

    public static void deposit(String logFile) {
        final Logger logger = Logger.getLogger(logFile);
        logger.write("Processed deposit (" + logger.toString() + ")");
    }

    public static void transfer(String logFile) {
        final Logger logger = Logger.getLogger(logFile);
        logger.write("Processed transfer (" + logger.toString() + ")");
    }
}
