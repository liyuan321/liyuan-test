package core.config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by zhaoyikui on 16/4/19.
 */
public class DatabaseConfig {

    private String url;
    private String username;
    private String password;
    private String name;

    public Connection conn = null;
    public PreparedStatement pst = null;

    public DatabaseConfig(String sql) {

        try {
            Properties prop =  new  Properties();
            InputStream ins = this.getClass().getResourceAsStream("/jdbc.properties");
            prop.load(ins);

            url = prop.getProperty("jdbc.url").trim();
            username = prop.getProperty("jdbc.username").trim();
            password = prop.getProperty("jdbc.password").trim();
            name = prop.getProperty("jdbc.name").trim();

            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url, username, password);//获取连接
            pst = conn.prepareStatement(sql);//准备执行语句
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            this.conn.close();
            this.pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
