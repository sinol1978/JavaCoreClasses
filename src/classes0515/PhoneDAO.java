package classes0515;

import java.sql.*;

import java.sql.SQLException;

public class PhoneDAO {
    public static final String SQL_SELECT_PHONE = "SELECT * FROM phones";
    public Phone findEntityById(Integer id){
        Phone phone = null;
        try (Connection connection = ConnectorDB.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(SQL_SELECT_PHONE)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int user_id = rs.getInt(2);
                String phone_number = rs.getString(3);
                phone = new Phone(id, user_id, phone_number);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return phone;
    }
}
