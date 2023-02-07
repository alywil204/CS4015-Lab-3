public class Demo {
    public static void main(String[] args) {
        Logger logger1 = new Logger("file.txt");
        Logger logger2 = new Logger("file.txt");
        Logger logger3 = new Logger("separatefile.txt");

        System.out.println(logger1);
        System.out.println(logger2);
        System.out.println(logger3);
    }
}
