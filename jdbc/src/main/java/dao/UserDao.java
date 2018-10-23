package dao;

import entity.Skill;
import entity.Tool;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDao implements IDao<User, Integer>{

    private Connection connection;

    public User create(User entity) throws SQLException {
        PreparedStatement stmt = null;

        try{
            stmt = connection.prepareStatement("INSERT INTO Users VALUES(?, ?, ?, ?)");
            stmt.setInt(1, entity.getId());
            stmt.setString(2, entity.getName());
            stmt.setString(3, entity.getEmail());
            stmt.setString(4, entity.getPhone());
            stmt.executeUpdate();
            stmt.close();

            for (Tool tool : entity.getTools()) {
                stmt = connection.prepareStatement("INSERT INTO Users_Tools VALUES(?, ?)");
                stmt.setInt(1, entity.getId());
                stmt.setInt(2, tool.getId());
                stmt.executeUpdate();
                stmt.close();
            }

            for (Skill skill : entity.getSkills()) {
                stmt = connection.prepareStatement("INSERT INTO Users_Skills VALUES(?, ?)");
                stmt.setInt(1, entity.getId());
                stmt.setInt(2, skill.getId());
                stmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();

            if(connection != null)
                connection.rollback();

        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }

        return entity;
    }

    public List<User> findAll() {
        return null;
    }

    public User find(Integer integer) {
        return null;
    }

    public User remove(Integer integer) {
        return null;
    }
}
