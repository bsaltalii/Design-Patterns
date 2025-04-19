package SingletonDesignPattern.ConfigManager;

public class ConfigManager {
    private static ConfigManager instance;

    private ConfigManager(){
        System.out.println("Config Manager created.");
    }

    public static ConfigManager getConfigManager(){
        if (instance == null){
            instance = new ConfigManager();
        }
        return instance;
    }
    public void config(String config){
        System.out.println(config + " has been updated.");
    }
}
