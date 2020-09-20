package Infrastructure;

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

    public String getTestBrowser() {
        return getEnvironmentVariableOrDefault("browser", "chrome");
    }

    public String getTestEnvironment() {
        return getEnvironmentVariableOrDefault("environment", "qa_env");
    }

    public String getTestEnvironment() {
        return getEnvironmentVariableOrDefault("environment", "qa_env");
    }
}