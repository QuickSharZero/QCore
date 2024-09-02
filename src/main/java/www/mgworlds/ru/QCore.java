package www.mgworlds.ru;

import org.bukkit.plugin.java.JavaPlugin;

public final class QCore extends JavaPlugin {

    private static QCore instance;

    @Override
    public void onEnable() {
       instance = this;

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

    public QCore getInstance(){ return  instance; }
}
