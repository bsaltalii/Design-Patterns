package SingletonDesignPattern.ConfigManager;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getConfigManager();
        ConfigManager manager1 = ConfigManager.getConfigManager();

        manager.config("Preferences settings");
        manager1.config("System setting");

        if (manager == manager1){
            System.out.println("Same Config Manager instance is used.");
        }else{
            System.out.println("Different Config Manager instances.");
        }
    }
}
