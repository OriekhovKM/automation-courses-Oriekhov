package HomeWorks.HomeWork_7;

public class RunTestLogger {
    public static void main(String[] args) {
        TestLogger logger = new TestLogger();
        for (int i = 0; i < 10; i++) {
            System.out.println(logger.log("operation " +i));
        }

    }
}
