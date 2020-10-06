package Infrastructure.config;

import Infrastructure.wdm.BrowserType;
import Infrastructure.wdm.DefaultWebDriverManager;
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


    RunOn runOn = RunOn.CLOUD;
    BrowserType browser;

    public Enum getEnumEnvironments(Enum envVar, Enum defaultValue) {
        Enum currentVarValue = envVar;
        return currentVarValue == null ?
                defaultValue : currentVarValue;
    }

    public Enum getRunOn() {
        return getEnumEnvironments(runOn, RunOn.LOCAL);
    }

    public Enum getTestBrowser() {
        return getEnumEnvironments(browser, BrowserType.OPERA);
    }
}