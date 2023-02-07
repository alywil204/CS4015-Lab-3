public class Demo {
    public static void main(String[] args) {
        final String logFile = "bank.log";
        Demo.withdraw(logFile);
        Demo.deposit(logFile);
        Demo.transfer(logFile);
    }

    public static void withdraw(String logFile) {
        Logger.getLogger(logFile).write("Processed withdrawal.");
    }

    public static void deposit(String logFile) {
        Logger.getLogger(logFile).write("Processed deposit.");
    }

    public static void transfer(String logFile) {
        Logger.getLogger(logFile).write("Processed transfer.");
    }
}
