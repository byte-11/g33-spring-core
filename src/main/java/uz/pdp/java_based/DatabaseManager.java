package uz.pdp.java_based;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@Setter
@ToString
public class DatabaseManager {
    @Value("${spring.datasource.driver}")
    private String driver;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.schema}")
    private String schema;

    private Connection connection;

    public void init() throws SQLException {
        /*connection = DriverManager.getConnection(
                url,
                username,
                password
        );*/
    }

    public void destroy() throws SQLException {
        /*connection.close();*/
    }
}
