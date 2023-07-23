import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertIntojdbc {
	 public static void main(String[] args) throws SQLException {
			
String sql="Insert into demo2(id,firstName,lastname,village)"+"values('2','ramesh','dhage','yeli')";
					
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
						
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b6-mysql","root","ramesh143");
						
		Statement statement=con.createStatement();
					
		statement.execute(sql);
		System.out.println("Insertion successfully...");
			con.close();
			statement.close();
					
		  } catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
		  }
					

}}
