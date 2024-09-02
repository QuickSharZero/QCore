package www.mgworlds.ru;

import org.bukkit.plugin.java.JavaPlugin;


public final class QCore extends JavaPlugin {

    private static QCore instance;
    private Database database;

    @Override
    public void onEnable() {
        instance = this;
        this.database = new Database();


        getLogger().info("-=-=-=-=-=-=-=-");
        getLogger().info("QCore ENABLED");
        getLogger().info("-=-=-=-=-=-=-=-");
    }
    @Override
    public void onDisable() {
        getLogger().info("-=-=-=-=-=-=-=-");
        getLogger().info("QCore DISABLED");
        getLogger().info("-=-=-=-=-=-=-=-");
    }

    public Database getDatabase() {return database; }
    public static QCore getInstance(){ return  instance; }
}
