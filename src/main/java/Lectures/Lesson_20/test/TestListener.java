package Lectures.Lesson_20.test;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class TestListener extends RunListener {

    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("-----------------------------------");
        System.out.println("Result pf the test run:");
        System.out.println("Run time:" +result.getRunTime() +"ms");
        System.out.println("Run count:" +result.getRunCount());
        System.out.println("Fail count:" +result.getFailureCount());
        System.out.println("Ignore count:" +result.getIgnoreCount());

    }

    @Override
    public void testSuiteStarted(Description description) throws Exception {
        super.testSuiteStarted(description);
        System.out.println("testSuiteStarted" +description);
        System.out.println("-----------------------------------");

    }

    @Override
    public void testSuiteFinished(Description description) throws Exception {
        super.testSuiteFinished(description);
        System.out.println("testSuiteFinished" +description);
        System.out.println("-----------------------------------");

    }

    @Override
    public void testStarted(Description description) throws Exception {
        super.testStarted(description);
        System.out.println("testStarted" +description);
        System.out.println("-----------------------------------");
    }

    @Override
    public void testFinished(Description description) throws Exception {
        super.testFinished(description);
        System.out.println("testFinished" +description);
        System.out.println("-----------------------------------");
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        super.testFailure(failure);
        System.out.println("testFailure" +failure);
        System.out.println("testFailure" +failure.getMessage());
        System.out.println("-----------------------------------");
    }
}
