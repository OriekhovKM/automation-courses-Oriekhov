package UrlBuilderTest;

import Infrastructure.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class PositiveUrlBuilderTest {
    @Test
    public  void urlBuilderTest() {

        String expectedUrl = "https://google.com:8080/search/searchPicture?param1=&q=query&oq=123456789&param6=param7&param4=param5&sq=params+this&param2=param3";
        HashMap<String, String> param = new HashMap<String, String>();
        param.put ("q", "query");
        param.put ("oq", "123456789");
        param.put ("sq", "params+this");
        String actualUrl = new UrlBuilder.Builder()
                .withProtocol("https")
                .withDomain("google")
                .withDomain("com")
                .withPort("8080")
                .withPath("search")
                .withPath("searchPicture")
                .withParam("param1")
                .withParam("param2", "param3")
                .withParam("param4", "param5")
                .withParam("param6", "param7")
                .withParam(param)
                .build();

        Assert.assertEquals("url not match expected", expectedUrl, actualUrl);
    }

}
