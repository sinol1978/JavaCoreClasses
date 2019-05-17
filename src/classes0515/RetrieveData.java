package classes0515;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static classes0515.ConnectionData.*;

public class RetrieveData {
    private static final String SELECT_QUERY = "SELECT * FROM phones;";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
            //System.out.printf("%-20s%s%n", "id", "username");
            System.out.println("-------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int user_id = resultSet.getInt("user_id");
                String phone_number = resultSet.getString("phone_number");
                System.out.printf("%s%s%s\n", id, user_id, phone_number);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
