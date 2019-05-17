package classes0515;
import java.sql.*;

import static classes0515.ConnectionData.*;

public class InsertDataPreparedStatement {
    private static final String INSERT_QUERY =
            "INSERT INTO phones (user_id, phone_number) VALUES (?,?)";

    public static void main(String[] args) {
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement(INSERT_QUERY)) {

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "misha");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "grisha");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
