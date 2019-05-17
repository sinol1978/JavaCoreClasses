package classes0515;

import java.sql.*;

import static classes0515.ConnectionData.*;

public class TestConnectionMySQL {

    private static final String CREATE_TABLE_QUERY =
            "CREATE TABLE users "
                    + "(id INT(5) NOT NULL AUTO_INCREMENT,"
                    + " username VARCHAR(50), "
                    + "PRIMARY KEY(id));";

    private static final String INSERT_IN_USERS = "INSERT INTO users (username) values ('Ivanov')";

    public static void main(String[] args) {



    }
    private void createTableUsers(){
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_TABLE_QUERY);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void insertIntoUsers(){
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(INSERT_IN_USERS);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}

