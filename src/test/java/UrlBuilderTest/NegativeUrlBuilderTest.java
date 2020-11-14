package UrlBuilderTest;

import Infrastructure.UrlBuilder;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.StringContains.containsString;

@RunWith(Parameterized.class)
public class NegativeUrlBuilderTest {
    private String errorMessage;
    private String urlValue;

    public NegativeUrlBuilderTest(String errorMessage, String urlValue) {
        this.errorMessage = errorMessage;
        this.urlValue = urlValue;
    }

    @Parameterized.Parameters
    public static Collection ControlData() {
        return Arrays.asList(new Object[][]{
                {"please enter:\nprotocol;\n", new UrlBuilder.Builder().withDomain("google").withDomain("com").withPort("8080").build()},
                {"please enter:\nprotocol;\ndomain;\n", new UrlBuilder.Builder().withPort("8080").build()},
                {"please enter:\nport;\n", new UrlBuilder.Builder().withProtocol("ftp").withDomain("google").withDomain("com").build()}
        });
    }

    @Test
    public void urlWithoutElements() {
        assertThat(errorMessage).as("url have unexpected data").isEqualTo(urlValue);
    }

}
