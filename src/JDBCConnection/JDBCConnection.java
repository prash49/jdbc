package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/jdbcpractice";
    private static final String DATABASE_USER_NAME = "root";
    private static final String DATABASE_PASSWORD = "password";

    public static void main(String[] args) throws SQLException {
        // lets start with basics how to connect to JDBC , if we use JPa there is not requirement of all these
        //as we starting JDBC freshly need to understand how JDBC can be connected
        // in here we are using MySql so we need Mysql driver and Connection manager
        Connection connection = null;
        try {
            Class.forName(DATABASE_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER_NAME, DATABASE_PASSWORD);
            System.out.println("Connection established");
            System.out.println("Connection established");
            System.out.println("URL: " + connection.getMetaData().getURL());
            System.out.println("Username: " + connection.getMetaData().getUserName());
            System.out.println("Database Product Name: " + connection.getMetaData().getDatabaseProductName());
            System.out.println("Database Product Version: " + connection.getMetaData().getDatabaseProductVersion());
        } catch (ClassNotFoundException | SQLException sq) {
            sq.printStackTrace();
        } finally {
            connection.close();
        }
    }
}
