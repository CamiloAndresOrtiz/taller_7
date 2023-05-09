package co.edu.com.projec2687350.connection_test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UseConnectionPool {
    private static Connection getConnection() throws SQLException {
        return ConnectionPool.getConnection();
    }
    public static void main (String[] args) throws SQLException {
        try (Connection conn = getConnection();
             Statement stmt = conn.executeQuery("SELECT * FROM my_app.users_tbl")) {
            while (rs.netxt()) {
                System.out.print(rs.getString(user_firstname));
                System.out.print(" | ");
                System.out.println(rs.getString("user_lastname"));
            }
        }
    }
}
