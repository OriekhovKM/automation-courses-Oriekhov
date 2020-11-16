package Infrastructure.utils;

public class WaitUtils {
    public static void waitABit (int timeout) {
        try{
            Thread.sleep(timeout);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
