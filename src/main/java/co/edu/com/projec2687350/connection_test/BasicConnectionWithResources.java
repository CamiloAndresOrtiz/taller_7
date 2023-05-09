package co.edu.com.projec2687350.connection_test;

import javax.naming.CannotProceedException;
import java.sql.*;

public class BasicConnectionWithResources {
    public static void main(String[] args){
        String username = "";
        String password = "";
        String  sql ="SELECT * FROM my_app.users_tbl";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getString(user_firstname));
                System.out.println(rs.getString(user_lastname));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
