package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public interface WebDriverManager {
    public String getBrowser();
    public void destroyBrowser(String browser);


//    public String createBrowser() {
//        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
//        switch (testBrowser) {
//            case "chrome":
//                return "new Google chrome driver";
//            case "firefox":
//                return "new Mozilla firefox driver";
//            default:
//                return "";
//        }
//    }
//
//    public void destroyBrowser(String browser) {
//        if (browser != null) {
//            System.out.println("Browser closed");
//        }
//    }
}
