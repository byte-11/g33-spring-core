package uz.pdp.xml_based;

import java.sql.SQLException;

public class UserService {
    private final DatasourceManager datasourceManager;

    public UserService(DatasourceManager datasourceManager) {
        this.datasourceManager = datasourceManager;
    }

    public void saveUser(String username) throws SQLException, ClassNotFoundException {
        datasourceManager.connection().prepareStatement(
                "INSERT INTO users(username) VALUES (?)"
        ).execute();

    }
}
