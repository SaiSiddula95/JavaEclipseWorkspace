import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseTest {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = ConnectionManager.getConnection();
            if (connection != null) {
                System.out.println("Connection established successfully!");
                // You can perform database operations here
                // For example:
                PreparedStatement statement = connection.prepareStatement("SELECT * FROM pet");
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    // Process your query results
                	String coffeeName = resultSet.getString("name");
    				System.out.println("Output: " + coffeeName);
                }
            } else {
                System.out.println("Failed to establish connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeConnection();
        }
    }
}
