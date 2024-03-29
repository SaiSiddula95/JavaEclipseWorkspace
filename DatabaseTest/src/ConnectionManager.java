import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String URL = "jdbc:mysql://localhost:3306/test_schema";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password!";

    private static Connection connection;

    // Establishes a connection to the database
    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Load MySQL JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                // Create connection
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    // Closes the database connection
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                connection = null;
            }
        }
    }
}