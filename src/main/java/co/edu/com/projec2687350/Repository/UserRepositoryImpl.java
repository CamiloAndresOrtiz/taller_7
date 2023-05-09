package co.edu.com.projec2687350.Repository;

import co.edu.com.projec2687350.connection_test.ConnectionPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class UserRepositoryImpl implements  Repository<User>{
    private String sql = null;
    @Override
    public List<User> listAllObj() throws SQLException {
        return null;
    }
    @Override
    public User byIdObj(Integer id) throws SQLException {
        return null;
    }
    @Override
    public Integer saveObj(User user) throws SQLException {
        return null;
    }

    @Override
    public void delateObj(Integer id) throws SQLException {

    }
    @Override
    public User createObj(ResultSet rs) throws SQLException {
        User user = new User();
        user.setUser_id(rs.getInt("user_id"));
        user.setUser_firstname(rs.getString("user_firstname"));
        user.setUser_lastname(rs.getString("user_lastname"));
        user.setUser_email(rs.getString("user_email"));
        user.setUser_passwoed(rs.getString("user_password"));
        return user;
    }// createObj
    @Override
    public list<User> listAllObj() throws SQLException{
        sql = "select u.user_id, u.user_fistname, u.user_lastname, u.user_email " + " from users_tbl u order by u.user_lastname, u.user_firstname";
        list<User> users = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection():
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                User u = createObj(rs);
                users.add(u);
            }
        }
    }

}
