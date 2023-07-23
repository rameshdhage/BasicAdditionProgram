import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fetchrecords {

	
	public static void Fechrecords(int id) {
		try {
			Connection connection =CommonConnection.getConnection();
			
PreparedStatement ps = connection.prepareStatement("SELECT * FROM demo2 where id=?");
ps.setInt(1,id);

ResultSet resultset = ps.executeQuery();



while (resultset.next()) {
	System.out.println("id>>" + resultset.getInt(1));
	System.out.println("firstname>>" + resultset.getString(2));
	System.out.println("lastname>>" + resultset.getString(3));
	System.out.println("village>>" + resultset.getString(4));
	
}

			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter id");
		int id = scanner.nextInt();
		Fechrecords(id);
		// TODO Auto-generated method stub

	}

}
