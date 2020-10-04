package Infrastructure;

import Infrastructure.config.ConfigurationManager;

public class TestServer {

    public String getUrl() {
        String testEnvironment = ConfigurationManager.getInstance().getTestEnvironment();
        String url = "";
        switch (testEnvironment) {
            case "qa_env":
                return "http://qa.env.mysite.com";
            case "prod_env":
                return "http://prod.env.mysite.com";
            case "staging_env":
                return "http://taging.env.mysite.com";
            default:
                return "";
        }
    }
}
