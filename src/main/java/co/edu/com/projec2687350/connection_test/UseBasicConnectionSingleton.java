package co.edu.com.projec2687350.connection_test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseBasicConnectionSingleton {
    public  static void main(String[] args) throws SQLException {
        try (Connection conn = BasicConnectionSingleton.getInstance();
             Statement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM MY_APP.USERS_TBL")) {
            while (rs.next()) {
                System.out.print(rs.getString("user_firstname,"));
                System.out.print(" | ");
                System.out.println(rs.getString("user_lastname"));
            }
        }
    }
}
