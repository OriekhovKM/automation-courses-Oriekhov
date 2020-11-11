package UrlBuilderTest;

import Infrastructure.UrlBuilder;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NegativeUrlBuilderTest {
    private SoftAssertions softAssertions;
    @Before
    public void setUp(){
        softAssertions = new SoftAssertions();
    }
    @After
    public void tearDown() {
        softAssertions.assertAll();
    }
    @Test
    public void urlWithoutElements(){
        String errorMessage1 = "please enter:\nprotocol;\n";
        String errorMessage2 = "please enter:\nprotocol;\ndomain;\n";
        String errorMessage3 = "please enter:\nport;\n";

        String actualMessage1 = new UrlBuilder.Builder().withDomain("google").withDomain("com").withPort("8080").build();
        String actualMessage2 = new UrlBuilder.Builder().withPort("8080").build();
        String actualMessage3 = new UrlBuilder.Builder().withProtocol("ftp").withDomain("google").withDomain("com").build();

        softAssertions.assertThat(actualMessage1).as("url without protocol").isEqualTo(errorMessage1);
        softAssertions.assertThat(actualMessage2).as("url without protocol and domain").isEqualTo(errorMessage2);
        softAssertions.assertThat(actualMessage3).as("url without port").isEqualTo(errorMessage3);

    }


}
