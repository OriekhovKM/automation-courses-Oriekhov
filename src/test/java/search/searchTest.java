package search;

import Infrastructure.base.TestBase;
import Infrastructure.pages.pagefactory.MainPageFactory;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchTest extends TestBase {
    @Test
    public void positiveSearchTest()  {
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());

        logger.log("guest user populate search field");
        mainPageFactory.populateSearchField("f-1");

        logger.log("guest user submit search request");
        mainPageFactory.submitSearchRequest();

        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/?s=f-1"));

        logger.log("verify search result");
        Assertions.assertThat(mainPageFactory.getSearchResultMsg()).isEqualTo("We found 3 results for your search.");
    }

    @Test
    public void negativeSearchTest()  {
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());

        logger.log("guest user populate search field");
        mainPageFactory.populateSearchField("523");

        logger.log("guest user submit search request");
        mainPageFactory.submitSearchRequest();

        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/?s=523"));

        logger.log("verify search result");
        Assertions.assertThat(mainPageFactory.getSearchResultMsg()).isEqualTo("We could not find any results for your search. You can give it another try through the search form below.");
    }


}
