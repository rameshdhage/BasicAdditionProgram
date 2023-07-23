import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonConnection {
	public static Connection getConnection() throws SQLException {
		Connection connection = null;
		try {
			// load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish a connection
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b6-mysql", "root", "ramesh143");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
