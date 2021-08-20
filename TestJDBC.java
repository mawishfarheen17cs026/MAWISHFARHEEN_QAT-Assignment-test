package AssignmentTest;


import java.sql.*;

public class TestJDBC {

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
				String url = "jdbc:oracle:thin:@localhost:1521/XE";
				String username = "SYSTEM";
				String password = "admin";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection(url,username,password);
				System.out.println("Connection created");
				Statement stmt = con.createStatement();
				
				String updateQuery = "update Day8 set name='Romaisa' where id=3";
		    	stmt.executeUpdate(updateQuery);	
		    	
		    	ResultSet rs = stmt.executeQuery("select * from Day8");
				System.out.println("Query Execution" +rs);
				
				 while(rs.next()) {
						
						System.out.println(rs.getString("id") + " : " + rs.getString("name") + " : " +rs.getString("subject")+ " : "+rs.getString("marks"));
					}
					con.close();
					
				

	}
	}



