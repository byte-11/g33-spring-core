package uz.pdp.xml_based;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Getter
@Setter
@ToString
public class DatasourceManager {
    private String driver;
    private String url;
    private String username;
    private String password;
    private String schema;

    public Connection connection() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        return DriverManager.getConnection(
                url,
                username,
                password
        );
    }
}
