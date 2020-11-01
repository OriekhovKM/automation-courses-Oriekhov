package Lectures.Lesson_20.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

@RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({
       NegativeConvertorTest.class,
       PositiveConvertorTest.class
})
public class Suite extends BlockJUnit4ClassRunner {
private TestListener listener;
    public Suite(Class<?> testClass) throws InitializationError {
        super(testClass);
        listener = new TestListener();
    }

    public void run(final RunNotifier notifier){
        notifier.addListener(listener);
        super.run(notifier);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Suite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
