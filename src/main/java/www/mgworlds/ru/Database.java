package www.mgworlds.ru;

import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Connection conn;

    public Connection getConnection(JavaPlugin plugin) throws SQLException {
        if(conn != null && !conn.isClosed() && !conn.isValid(300)){ return conn; }
        if(!plugin.getConfig().getBoolean("database.enable")){
            String url = "jdbc:sqlite:" + plugin.getDataFolder() + "/database.db";
            Connection conn = null;
            this.conn = DriverManager.getConnection(url);
            return this.conn;
        }

        String hostname = plugin.getConfig().getString("database.host");
        int port = plugin.getConfig().getInt("database.port");
        String dbName = plugin.getConfig().getString("database.database_name");
        String username = plugin.getConfig().getString("database.username");
        String password = plugin.getConfig().getString("database.password");

        String url = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName;
        this.conn = DriverManager.getConnection(url, username, password);
        return this.conn;
    }

}
