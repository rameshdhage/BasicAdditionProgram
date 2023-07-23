import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdatabase {
	public static void main(String[] args) throws SQLException  {
		
String sql="insert into demo2(id,firstname,lastname,village)"+"values('9','anand','ubale','hatani')";

try {
	Class.forName("com.mysql.jdbc.Driver");
	
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b6-mysql","root","ramesh143");
//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b6-mysql","root","ramesh143");
	
	Statement statement=con.createStatement();
	
	statement.execute(sql);
	System.out.println("insertion successfully");
	con.close();
	statement.close();
	
	
	
	
	
	
	
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}






	}

}