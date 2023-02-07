public class Demo {
    public static void main(String[] args) {
        final String logFile = "demo.log";
        int nThreads = 10;
        Thread[] threads = new Thread[nThreads];
        for (int i = 0; i < nThreads; i++) {
            threads[i] = new Thread(new Process(logFile, i + 1));
        }

        for (int i = 0; i < nThreads; i++) {
            threads[i].start();
        }
    }
}