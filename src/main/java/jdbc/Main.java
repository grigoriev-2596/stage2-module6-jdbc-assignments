package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        CustomDataSource customDataSource = CustomDataSource.getInstance();
        Connection conn = customDataSource.getConnection();
    }
}
