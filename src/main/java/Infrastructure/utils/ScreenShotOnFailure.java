package Infrastructure.utils;


import org.junit.rules.MethodRule;
import org.apache.commons.io.FileUtils;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
public class ScreenShotOnFailure implements MethodRule {
    private WebDriver driver;

    public ScreenShotOnFailure(WebDriver driver){
        this.driver = driver;
    }

    public Statement apply(final Statement statement, final FrameworkMethod frameworkMethod, final Object o) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                try {
                    statement.evaluate();
                } catch (Throwable t) {
                    captureScreenShot(frameworkMethod.getName());
                    throw t;
                }
            }

            public void captureScreenShot(String fileName) throws IOException {
                File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                fileName += UUID.randomUUID().toString();
                File targetFile = new File("./Screenshots/" + fileName + ".png");
                FileUtils.copyFile(scrFile, targetFile);
            }
        };
    }
}


