package Infrastructure.config;


import Infrastructure.wdm.BrowserType;
import Infrastructure.wdm.RunOn;

public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getEnvironmentVariableOrDefault(String envVar, String defaultValue) {
        String currentVarValue = System.getenv(envVar);
        return currentVarValue == null || currentVarValue.isEmpty() ?
                defaultValue : currentVarValue;
    }



    public String getTestEnvironment() {
        return getEnvironmentVariableOrDefault("environment", "qa_env");
    }

    public String getCurrentEnvironment() {
        return getEnvironmentVariableOrDefault("runEnv", "local");
    }



    public RunOn getRunOn() {
        return RunOn.valueOf(getEnvironmentVariableOrDefault("runOn", "LOCAL"));
    }

    public BrowserType getTestBrowser() {
        return BrowserType.valueOf(getEnvironmentVariableOrDefault("browser", "CHROME"));

    }

    public String getRemoteHubUrl() {return getEnvironmentVariableOrDefault("hubUrl", "http://hubUrl.test.site");}
}